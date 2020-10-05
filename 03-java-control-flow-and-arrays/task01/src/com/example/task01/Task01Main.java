package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        System.out.print(canGetDriverLicense(20));
    }

    static boolean canGetDriverLicense(int age) {
        return age >=18;
    }
}
