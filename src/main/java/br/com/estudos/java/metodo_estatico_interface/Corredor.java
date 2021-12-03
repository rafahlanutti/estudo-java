package br.com.estudos.java.metodo_estatico_interface;

public interface Corredor {

    // Modificador public por padrão, moditicador abstract não existente
    static double calculeVelocidade(double tempo, double distancia) {
        return distancia / tempo;
    }

    // Metodo publico por padrão, possui abstract por padrão
    // Métodos static em Interfaces NÃO fazem parte da API
    double calcularVelocidade(Boolean correr);
}
