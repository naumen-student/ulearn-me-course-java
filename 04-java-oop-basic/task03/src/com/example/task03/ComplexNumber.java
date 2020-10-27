package com.example.task03;

public class ComplexNumber {

    double realPart;
    double imaginaryPart;

    ComplexNumber(double re, double im) {
        realPart = re;
        imaginaryPart = im;
    }

    ComplexNumber add(ComplexNumber comp) {
        realPart += comp.realPart;
        imaginaryPart += comp.imaginaryPart;

        return new ComplexNumber(realPart, imaginaryPart);
    }

    ComplexNumber multiply(ComplexNumber comp) {
        double a = realPart;
        double b = imaginaryPart;
        double c = comp.realPart;
        double d = comp.imaginaryPart;
        realPart = a * c - b * d;
        imaginaryPart = a * d + c * b;

        return new ComplexNumber(realPart, imaginaryPart);
    }

    public String toString() {
        if (imaginaryPart > 0) return String.format("%f+%fi", realPart, imaginaryPart);
        return String.format("%f%fi", realPart, imaginaryPart);
    }
}
