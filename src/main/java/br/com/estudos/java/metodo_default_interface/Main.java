package br.com.estudos.java.metodo_default_interface;

public class Main {

    /**
     * M�todos Default em interfaces s�o para evitar que voc� tenha que fornecer uma
     * implementa��o para um novo m�todo em uma interface.
     */

    public static void main(String[] args) {
        new CorredorImp().correrRapido();
        new PilotoImp().correrRapido();
        new CorredorComMetodoDefaultSobrescrito().correrRapido();
    }

}
