package com.example.task03;

import sun.awt.geom.AreaOp;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5, 14);
        ComplexNumber num2 = new ComplexNumber(9.04, 7.03);

        System.out.println("The first complex number: " + num1);
        System.out.println("The second complex number: " + num2);
        System.out.println("Sum: " + num1.calculateSum(num2));
        System.out.println("Multiplication: " + num1.multiply(num2));
    }
}
