package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {
        int result = (int)(centimetre / 100);
        return result;
    }

    public static void main(String[] args) {
        int result = getMetreFromCentimetre(999999);
        System.out.println(result);
    }

}
