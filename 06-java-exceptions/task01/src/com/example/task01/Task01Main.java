package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {

        codeWithNPE();

    }

    static void codeWithNPE() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        Integer A = null, B = 1;
        System.out.println(A+B);
    }
}
