package br.com.estudos.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OperacoesFinais {

    public static void main(String[] args) {
        menor();
        maior();
        contagem();
        collectorToList();
        agrupar();
        joining();
    }

    private static void menor() {
        List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
        Optional<Integer> menorNumero = lista.stream()
                                             .map(e -> e * 2) // multiplica cada item por 2

                                             .min(Comparator.naturalOrder()); // pega o menor item pela ordem natural
        System.out.println("Usando o min");
        System.out.println(menorNumero.get());
    }

    private static void maior() {
        List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
        Optional<Integer> menorNumero = lista.stream()
                                             .map(e -> e * 2) // multiplica cada item por 2
                                             .max(Comparator.naturalOrder()); // pega o menor item pela ordem natural
        System.out.println("Usando o Max");
        System.out.println(menorNumero.get());
    }

    private static void contagem() {
        List<Integer> lista;
        lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
        Long quantidade = lista.stream()
                               .filter(e -> e % 2 == 0) // mantém apenas números pares
                               .count(); // pega quantos itens restam no stream
        System.out.println("Usando o count");
        System.out.println(quantidade);
    }

    private static void collectorToList() {
        List<Integer> novaLista = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 3, 45, 56, 6)
                                        .stream()
                                        .filter(e -> e % 2 == 0) // mantém apenas números pares
                                        .map(e -> e * 2) // multiplica cada item por 2
                                        .collect(Collectors.toList()); // coleta todos os itens em uma nova lista
        System.out.println("Collectors.toList()");
        System.out.println(novaLista);
    }

    private static void agrupar() {
        List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
        Map<Boolean, List<Integer>> mapa = lista.stream()
                                                .map(e -> e * 2) // multiplica cada item por 2
                                                .collect(Collectors.groupingBy(e -> e > 8));

        /**
         * agrupa itens baseado no resultado da comparação, se a expressão for condição
         * cria um map com true/false
         */

        System.out.println("Usando groupingBy");
        System.out.println(mapa);
    }

    private static void joining() {

        List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
        String stringUnica = lista.stream()
                                  .map(String::valueOf) // transforma cada item em String
                                  .collect(Collectors.joining(";")); // junta todas as Strings em uma única separada por
                                                                     // ';'
        System.out.println("Usando joining");
        System.out.println(stringUnica);
    }
}
