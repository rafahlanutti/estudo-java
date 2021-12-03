package br.com.estudos.java.metodo_estatico_interface;

public interface Corredor {

    // Modificador public por padr�o, moditicador abstract n�o existente
    static double calculeVelocidade(double tempo, double distancia) {
        return distancia / tempo;
    }

    // Metodo publico por padr�o, possui abstract por padr�o
    // M�todos static em Interfaces N�O fazem parte da API
    double calcularVelocidade(Boolean correr);
}
