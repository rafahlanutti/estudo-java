package br.com.estudos.java.reduce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

import org.junit.jupiter.api.Test;

class ReduceEstudosTest {

    private ReduceEstudos reduce = new ReduceEstudos();
    private List<Integer> numeros = Arrays.asList(1, 2, 3);

    @Test
    void deveSomarUmaListaDeNumeros() {
        var resultado = reduce.somarERetornarOptional(numeros);
        assertEquals(6, resultado.get());
    }

    @Test
    void deveSomarUmaListaDeNumerosEUtilizarValorDeIdentidade() {

        var resultado = reduce.somarERetornarIntegerUtilizandoValorDeIdentidade(numeros);
        assertEquals(6, resultado);

    }

    @Test
    void deveMultiplicarUmaListaDeNumeros() {
        var resultado = reduce.multiplicarERetornarOptional(numeros);
        assertEquals(6, resultado.get());
    }

    @Test
    void deveMultiplicarUmaListaDeNumerosEUtilizarValorDeIdentidade() {
        var resultado = reduce.multiplicarERetornarIntegerUtilizandoValorDeIdentidade(numeros);
        assertEquals(6, resultado);

    }

    @Test
    void deveUtilizarFuncaoDeCombinacao() {
        var resultado = reduce.somarComFuncaoDeCombinacao(numeros);
        assertEquals(6, resultado);
    }

    @Test
    void deveRetornarMenorValorDeUmArrayDouble() {
        var resultado = reduce.retornarOMenorValor(DoubleStream.of(0.1, 2.4, 13));
        assertEquals(0.1, resultado);
    }

}
