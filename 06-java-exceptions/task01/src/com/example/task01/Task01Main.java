package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {

        codeWithNPE();

    }

    static void codeWithNPE() {

        int [] a = null;
        System.out.println(a.length);

    }
}
