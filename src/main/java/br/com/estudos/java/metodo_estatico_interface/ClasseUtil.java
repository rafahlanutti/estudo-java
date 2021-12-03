package br.com.estudos.java.metodo_estatico_interface;

public class ClasseUtil {

    private ClasseUtil() {
        /**
         * Classe util geralmente existe para ter metodos estaticos. Essas classes
         * geralmente possuem construtores private para n�o serem instanciadas
         * 
         * Problema da classe: N�o respeita a Orienta��o a Objeto,pois cont�m apenas
         * c�digo estruturado.
         */

    }

    public static void metodoUtil() {

        System.out.println("Metodo que faz algo legal.");
    }

    public static void metodoUtilDois(String s1, String s2) {

        var stringBuilder = new StringBuilder();
        stringBuilder.append("Metodo legal com outros parametros")
                     .append(" ")
                     .append(s1)
                     .append(" ")
                     .append(s2);
        System.out.println(stringBuilder.toString());
    }
}
