package br.com.estudos.java.metodo_estatico_interface;

public class ClasseUtil {

    private ClasseUtil() {
        /**
         * Classe util geralmente existe para ter metodos estaticos. Essas classes
         * geralmente possuem construtores private para não serem instanciadas
         * 
         * Problema da classe: Não respeita a Orientação a Objeto,pois contém apenas
         * código estruturado.
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
