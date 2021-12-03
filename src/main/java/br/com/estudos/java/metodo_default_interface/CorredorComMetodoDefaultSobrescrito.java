package br.com.estudos.java.metodo_default_interface;

public class CorredorComMetodoDefaultSobrescrito implements Corredor, Piloto {

    @Override
    public void correrRapido() {
        /**
         * Sempre que sobrescrever um metodo default, será necessário informar a
         * interface que quer sobrescrever seguido de super e o metodo
         */
        Piloto.super.correrRapido();

        // Podendo também comentar o metodo e fazer sua propria implementação
    }
}
