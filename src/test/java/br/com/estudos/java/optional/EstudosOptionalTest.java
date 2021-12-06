package br.com.estudos.java.optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class EstudosOptionalTest {

    private EstudosOptional estudoOptional = new EstudosOptional();

    @Test
    void deveCriarUmOptionalDeIntegerAPartirDeUmaString() {

        var resultado = estudoOptional.converterStringParaUmOptionalInteger("1");
        assertEquals(1, resultado.get());
    }

    @Test
    void naoDeveDarExessaoAoConverterUmaStringEmNumero() {
        assertFalse(estudoOptional.converterStringParaUmOptionalInteger("String n�o num�rica")
                                  .isPresent());
    }

    @Test
    void deveTratarExessaoAoEnviarStringNaoNumerica() {
        assertThrows(NumberFormatException.class,
                () -> estudoOptional.converterStringParaIntLancandoExessao("String n�o num�rica"));

    }

    @Test
    void deveRetornarOPrimeiroDaListaOuDarExessao() {

        assertEquals(1, estudoOptional.retornarPrimeiroDaListaOuExessao(Stream.of(1, 2, 3, 4, 5)));

    }

}
