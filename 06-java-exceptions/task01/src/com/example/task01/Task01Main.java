package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        try {
            codeWithNPE();
        } catch (NullPointerException e) {
            System.out.println("It's okay");
        }
    }

    static void codeWithNPE() {
        String str = null;
        System.out.println(str.contains("a"));
    }
}
