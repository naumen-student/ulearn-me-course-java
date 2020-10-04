package com.example.task03;

class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex (double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex addition(Complex z) {
        return new Complex(this.realPart + z.realPart, this.imaginaryPart + z.imaginaryPart);
    }

    public Complex subtraction(Complex z) {
        return new Complex(this.realPart - z.realPart, this.imaginaryPart - z.imaginaryPart);
    }

    public Complex multiplication(Complex z) {
        double rezRealPart = this.realPart * z.realPart - this.imaginaryPart * z.imaginaryPart;
        double rezImaginaryPart = this.realPart*z.imaginaryPart + z.realPart*this.imaginaryPart;
        return new Complex(rezRealPart, rezImaginaryPart);
    }

    public String toString() {
        return "z = " + Double.toString(realPart) + " + " + Double.toString(imaginaryPart) + "i";
    }
}

public class Task03Main {
    public static void main(String[] args) {
        Complex z1 = new Complex(1, 1);
        Complex z2 = new Complex(2, 2);
        Complex z3 = z1.addition(z2);
        Complex z4 = z1.subtraction(z2);
        Complex z5 = z1.multiplication(z2);
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z4);
        System.out.println(z5);
    }
}
