package br.com.estudos.java.lambdas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            public void run() {

                System.out.println("Run sem lambda");
            }
        }).run();

        // Como a JVM sabe diferenciar um do outro?
        new Thread(() -> System.out.println("Run com lambda")).run();

        /**
         * SAM - Single Abstract Method Qualquer interface que tenha apenas um metodo
         * abstrado pode virar lambda Qualquer interface padr�o SAM pode virar uma
         * express�o lambda
         */

        // Porque existe lambda? S� para escrever menos? N�o para usar stream.

        var listaParaEstudarStreams = Arrays.asList(1, 2, 3, 4, 5, 6);

        listaParaEstudarStreams.stream()
                               .filter(numero -> numero % 2 == 0)
                               .forEach(System.out::println);
    }
 
    @FunctionalInterface
    interface InterfaceComAnotacaoFuncionalInterface {

        /**
         * A anota��o @FunctionalInterface faz com que caso a interface tenha mais de um
         * metodo n�o seja possivel ser compilada, por�m n�o � obrigat�ria
         */
        public abstract void fazAlgo();
    }
}
