package br.com.estudos.java.streams;

import java.util.Arrays;
import java.util.List;

public class OperacoesIntermediarias {

    /**
     * Operações intermediarias stream
     * 
     * IMPORTANTE: Sempre executar os filtros antes de um map.
     */
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
        lista.stream() //fluxo de dados
             .skip(2) // ignora os dois primeiros números
             .limit(9) // limita a 9 números
             .map(e -> e * 2) // multiplica cada item por 2
             .distinct() // ignora números iguais
             .forEach(System.out::println);
    }
}
