package com.example.task03;

public class ComplexNumber {

    int realPart;
    int imaginaryPart;

    ComplexNumber(int re, int im) {
        realPart = re;
        imaginaryPart = im;
    }

    void add(ComplexNumber comp) {
        realPart += comp.realPart;
        imaginaryPart += comp.imaginaryPart;
    }

    void multiply(ComplexNumber comp) {
        int a = realPart;
        int b = imaginaryPart;
        int c = comp.realPart;
        int d = comp.imaginaryPart;

        realPart = a * c - b * d;
        imaginaryPart = a * d + c * b;
    }

    public String toString() {
        if (imaginaryPart > 0) return String.format("%d+%di", realPart, imaginaryPart);
        return String.format("%d%di", realPart, imaginaryPart);
    }
}
