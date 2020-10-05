package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, 3);
        ComplexNumber z2 = new ComplexNumber(-1, 1);

        System.out.println("z1 + z2 = " + z1.sum(z2));
        System.out.println("z1 * z2 = " + z1.multiply(z2));
    }
}
