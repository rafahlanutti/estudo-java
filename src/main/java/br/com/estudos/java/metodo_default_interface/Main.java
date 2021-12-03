package br.com.estudos.java.metodo_default_interface;

public class Main {

    /**
     * Métodos Default em interfaces são para evitar que você tenha que fornecer uma
     * implementação para um novo método em uma interface.
     */

    public static void main(String[] args) {
        new CorredorImp().correrRapido();
        new PilotoImp().correrRapido();
        new CorredorComMetodoDefaultSobrescrito().correrRapido();
    }

}
