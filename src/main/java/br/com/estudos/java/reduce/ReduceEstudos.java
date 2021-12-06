package br.com.estudos.java.reduce;

import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

import org.junit.jupiter.api.Disabled;

public class ReduceEstudos {

    public Optional<Integer> somarERetornarOptional(List<Integer> numerosParaSomar) {

        return numerosParaSomar.stream()
                               .reduce((n1, n2) -> n1 + n2);
    }

    public Integer somarERetornarIntegerUtilizandoValorDeIdentidade(List<Integer> numerosParaSomar) {

        /**
         * O Valor de Identidade tem a seguinte premissa n1 + n(x) = n(x). Ou seja, qual
         * numero de identidade + n(x) = n(x)? No caso da soma é o 0. Multiplicação
         * seria o 1.
         */
        return numerosParaSomar.stream()
                               .reduce(0, (n1, n2) -> n1 + n2);

    }

    public Optional<Integer> multiplicarERetornarOptional(List<Integer> numeros) {

        return numeros.stream()
                      .reduce((n1, n2) -> n1 * n2);
    }

    public Integer multiplicarERetornarIntegerUtilizandoValorDeIdentidade(List<Integer> numeros) {

        /**
         * O Valor de Identidade tem a seguinte premissa n1 + n(x) = n(x). Ou seja, qual
         * numero de identidade + n(x) = n(x)? No caso da soma é o 0. Multiplicação
         * seria o 1.
         */
        return numeros.stream()
                      .reduce(1, (n1, n2) -> n1 * n2);

    }

    @Disabled("não usar muito perigoso")
    public Integer subtrairValor(List<Integer> numeros) {
        /**
         * Só é interessante usar o reduce para funções associativas ou seja funções que
         * mesmo separando em pares o resultado continua sendo o mesmo
         * 
         * (n1 + n2) + (n3 + n4) + (n5 + n6) é igual n1 + n2 + n3 + n4 + n5 + n6 (n1 -
         * n2) - (n3 - n4) - (n5 - n6) não é igual n1 - n2 - n3 - n4 - n5 - n6 Então
         * como não é uma função associativa não é recomendado utilizar reduce
         * 
         */
        return numeros.stream()
                      .reduce(1, (n1, n2) -> n1 - n2);
    }

    public Integer somarComFuncaoDeCombinacao(List<Integer> numeros) {

        /**
         * Função de combinação mais utilizada com parallel que aproveita dos
         * processadores para efetuar as duas funções assim conseguindo um melhor
         * desempenho.
         */
        return numeros.stream()
                      .parallel()
                      .reduce(0, (n1, n2) -> n1 + n2, (n1, n2) -> n1 + n2);
    }

    public double retornarOMenorValor(DoubleStream numeros) {

        return numeros.reduce(Double.POSITIVE_INFINITY, (n1, n2) -> Math.min(n1, n2));

    }

}
