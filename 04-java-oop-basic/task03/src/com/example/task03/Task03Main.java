package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber Z1 = new ComplexNumber(15.3, 10.234);
        ComplexNumber Z2 = new ComplexNumber(16, 8.17);
        Z1.printComplexNumber();
        Z2.printComplexNumber();
        System.out.println(Z1.addComplex(Z1, Z2));
        System.out.println(Z1.subtractComplex(Z1, Z2));
        System.out.println(Z1.multiplyComplex(Z1, Z2));
    }
}


