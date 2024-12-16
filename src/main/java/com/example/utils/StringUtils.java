package com.example.utils;

public class StringUtils {
    public static boolean sonIguales(String a, String b){
        return a.equals(b);
    }

    public static boolean contieneLetra(String palabra, char letra){
        String palabraEnMinusculas = palabra.toLowerCase();
        char letraEnMinusculas = Character.toLowerCase(letra);

        int indice = palabraEnMinusculas.indexOf(letraEnMinusculas);
        if (indice == -1){
            return false;
        } else {
            return true;
        }
    }
}
