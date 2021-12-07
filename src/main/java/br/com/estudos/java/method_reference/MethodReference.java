package br.com.estudos.java.method_reference;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        /**
         * method reference
         */
        numeros.stream()
            .forEach(System.out::println);

        /**
         * sem method reference
         */
        numeros.stream()
            .forEach((n) -> System.out.println(n));

        /**
         * method reference com metodos estáticos
         */

        numeros.stream()
            .map((n) -> multipliquePorDois(n))
            .forEach(System.out::println);

        numeros.stream()
            .map(MethodReference::multipliquePorDois)
            .forEach(System.out::println);

        /**
         * method reference com construtores
         */

        numeros.stream()
            .map((n) -> new BigDecimal(n))
            .forEach(System.out::println);

        numeros.stream()
            .map(BigDecimal::new)
            .forEach(System.out::println);

        /**
         * method reference com várias instâncias
         */

        numeros.stream()
            .map((n) -> n.doubleValue())
            .forEach(System.out::println);

        numeros.stream()
            .map(Integer::doubleValue)
            .forEach(System.out::println);

        /**
         * method reference com única instância
         */
        BigDecimal dois = new BigDecimal(2);
        numeros.stream()
            .map(BigDecimal::new)
            .map((b) -> dois.multiply(b))
            .forEach(System.out::println);

        numeros.stream()
            .map(BigDecimal::new)
            .map(dois::multiply)
            .forEach(System.out::println);
    }

    private static Integer multipliquePorDois(Integer i) {
        return i * 2;
    }

}