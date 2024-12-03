package com.example.utils;

public class MathUtils {

    public static int max(int x, int y){
        if (x > y){
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        int x = 6;
        int y = 4;
        System.out.println(max(x, y));

        x = 8;
        y = -10;
        System.out.println(max(x, y));
    }


}
