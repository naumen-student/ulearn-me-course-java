package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        Integer x = null;
        Integer y = 3;
        Integer z = x + y;
    }
}
