package br.com.estudos.java.metodo_default_interface;

public interface Piloto {
    default void correrRapido() {
        System.out.println("Piloto correndo rápido.");
    }
}
