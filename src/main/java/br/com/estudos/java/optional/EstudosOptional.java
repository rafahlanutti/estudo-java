package br.com.estudos.java.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class EstudosOptional {

    public Optional<Integer> converterStringParaUmOptionalInteger(String numero) {

        try {
            return Optional.of(Integer.valueOf(numero));

        } catch (Exception e) {

            return Optional.empty();
        }

    }

    public Integer converterStringParaIntLancandoExessao(String numero) {

        var resultado = this.converterStringParaUmOptionalInteger(numero);

        return resultado.orElseThrow(() -> new NumberFormatException("Formato errado"));
    }

    public Integer retornarPrimeiroDaListaOuExessao(Stream<Integer> numeros) {

        return numeros.findFirst()
                      .orElseThrow(() -> new ArrayIndexOutOfBoundsException("Sem numeros"));
    }

}
