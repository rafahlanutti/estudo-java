package br.com.estudos.java.interface_funcional;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        /**
         * Estudo de interfaces funcionais - Supplier - (fornecedor) - Consumer e
         * BiConsumer - (consumidor) - Predicate e BiPredicate - (operador logico) -
         * Funcion e BiFunction - (função mais generica retorna qualquer tipo) -
         * UnaryOperator e BinaryOperator - (função mais generica retorna o mesmo tipo)
         */

        var generate = Stream.generate(supplierUse())
                             .limit(5);

        generate.forEach(Main::consumerUse);

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numeros.stream()
               .filter(e -> e % 2 == 0) // Predicate - Recebe um valor e faz alguma comparação
               .map(e -> e.doubleValue()) // Function - Recebe um valor e retorna outro de qualquer tipo
               .reduce((e1, e2) -> e1 + e2)// BinaryOperator - Recebe um valor e retorna outro do mesmo tipo
               .ifPresent(System.out::println);
    }

    private static void consumerUse(Integer e) {
        /**
         * Consumer - Recebe um elemento e não retorna nada
         */
        System.out.println(e);
    }

    private static Supplier<? extends Integer> supplierUse() {
        /**
         * Uso de Supplier - (fornecedor) Não recebe nada e retorna valores
         */
        return () -> new Random().nextInt();
    }
}
