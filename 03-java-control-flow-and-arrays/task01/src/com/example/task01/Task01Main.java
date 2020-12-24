package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        boolean b = canGetDriverLicense(100);
        System.out.println(b);
    }

    static boolean canGetDriverLicense(int age) {
        return age >= 18;
    }
}
