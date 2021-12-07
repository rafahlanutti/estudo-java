package br.com.estudos.java.collect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectEstudos {

    public List<Integer> collectSemCollectorExemplo(List<Integer> numeros) {

        /**
         * fornecedor - acumulação - combinação
         */
        return numeros.stream()
                      .collect(ArrayList::new, (lista, elemento) -> lista.add(elemento),
                              (l1, l2) -> l1.addAll(l2));
    }

    public List<Integer> collectComCollectorExemplo(List<Integer> numeros) {

        return numeros.stream()
                      .collect(Collectors.toList());
    }

    public Set<Integer> collectToSet(List<Integer> numeros) {

        /**
         * toSet
         */
        return numeros.stream()
                      .collect(Collectors.toSet());
    }

    public String collectJoining(List<Integer> numeros) {

        /**
         * Retorna uma lista concatenada podendo ser separada por algum caractere
         */
        return numeros.stream()
                      .map(e -> e.toString())
                      .collect(Collectors.joining("."));
    }

    public Double collectMedia(List<Integer> numeros) {

        /**
         * Retorna media da lista
         */
        return numeros.stream()
                      .collect(Collectors.averagingInt(n -> n.intValue()));
    }

    public Integer collectSoma(List<Integer> numeros) {

        /**
         * Retorna soma da lista
         */
        return numeros.stream()
                      .collect(Collectors.summingInt(n -> n.intValue()));
    }

    public IntSummaryStatistics collectSummarizing(List<Integer> numeros) {

        /**
         * Retorna um IntSummaryStatistics com várias variaveis que podem ser uteis
         */
        return numeros.stream()
                      .collect(Collectors.summarizingInt(n -> n.intValue()));
    }

    public Long collectCount(List<Integer> numeros) {

        /**
         * Retorna o count da lista
         */
        return numeros.stream()
                      .collect(Collectors.counting());
    }

    public Optional<Integer> collectMax(List<Integer> numeros) {

        /**
         * Retorna o max da lista
         */
        return numeros.stream()
                      .collect(Collectors.maxBy(Comparator.naturalOrder()));
    }

    public Optional<Integer> collectMin(List<Integer> numeros) {

        /**
         * Retorna o min da lista
         */
        return numeros.stream()
                      .collect(Collectors.minBy(Comparator.naturalOrder()));
    }

    public Map<Integer, List<Integer>> collectGoupingBy(List<Integer> numeros) {
        /**
         * Collect que agrupa e retorna um map De acordo com uma expressão lambda agrupa
         * seus dados
         */

        return numeros.stream()
                      .collect(Collectors.groupingBy((elemento) -> elemento % 2));

    }

    public Map<Boolean, List<Integer>> collectPartitionBy(List<Integer> numeros) {
        /**
         * Collect que agrupa e retorna um map De acordo com uma expressão lambda agrupa
         * seus dados com true e false
         * Ex: Funcionarios que ganham mais de 5000
         */

        return numeros.stream()
                      .collect(Collectors.partitioningBy((elemento) -> elemento % 2 == 0));

    }

}
