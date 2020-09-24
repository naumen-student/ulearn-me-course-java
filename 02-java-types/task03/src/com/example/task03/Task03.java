package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        if (centimetre < 100) return 0;
        else centimetre /= 100;
        return centimetre;

    }

    public static void main(String[] args) {

        int result = getMetreFromCentimetre(14595);
        System.out.println(result);

    }

}
