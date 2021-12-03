package br.com.estudos.java.metodo_estatico_interface;

public class CorredorImp implements Corredor {

    double tempo;
    double distancia;

    @Override
    public double calcularVelocidade(Boolean correr) {

        if (correr) {
            return tempo / (distancia / 2);
        }
        // Metodo static da interface n�o faz parte da API s� podendo ser chamado pela
        // interface.
        return Corredor.calculeVelocidade(tempo, distancia);
    }

}
