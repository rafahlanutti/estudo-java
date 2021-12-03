package br.com.estudos.java.metodo_default_interface;

public class CorredorComMetodoDefaultSobrescrito implements Corredor, Piloto {

    @Override
    public void correrRapido() {
        /**
         * Sempre que sobrescrever um metodo default, ser� necess�rio informar a
         * interface que quer sobrescrever seguido de super e o metodo
         */
        Piloto.super.correrRapido();

        // Podendo tamb�m comentar o metodo e fazer sua propria implementa��o
    }
}
