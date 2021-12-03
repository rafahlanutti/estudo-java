package br.com.estudos.java.metodo_estatico_interface;

public class Main {

    public static void main(String[] args) {
        var corredor = new CorredorImp();
        corredor.tempo = 15;
        corredor.distancia = 20;

        System.out.println(corredor.calcularVelocidade(true));
        System.out.println(corredor.calcularVelocidade(false));

        ClasseUtil.metodoUtil();
        ClasseUtil.metodoUtilDois("Metodo de classe util", "De uma classe que só tem metodos");
    }

}
