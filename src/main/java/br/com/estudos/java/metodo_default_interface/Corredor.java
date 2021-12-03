package br.com.estudos.java.metodo_default_interface;

public interface Corredor {
    default void correrRapido() {
        System.out.println("Corredor correndo rápido.");
    }
}
