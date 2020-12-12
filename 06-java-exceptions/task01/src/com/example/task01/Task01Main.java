package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {

        codeWithNPE();

    }

    static void codeWithNPE() {
        Integer n1 = null;
        System.out.println(n1.toString());
    }
}
