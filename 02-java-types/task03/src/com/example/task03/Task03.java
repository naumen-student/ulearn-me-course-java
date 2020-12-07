package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        return centimetre/100;
    }

    public static void main(String[] args) {

        int result = getMetreFromCentimetre(345);
        System.out.println(result);
        result = getMetreFromCentimetre(200);
        System.out.println(result);
        result = getMetreFromCentimetre(0);
        System.out.println(result);
        result = getMetreFromCentimetre(190910900);
        System.out.println(result);
    }

}
