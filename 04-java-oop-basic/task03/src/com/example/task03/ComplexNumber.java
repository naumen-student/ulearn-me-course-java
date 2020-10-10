package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber() {
        realPart = 0;
        imaginaryPart = 0;
    }

    public ComplexNumber(double rp, double ip) {
        realPart = rp;
        imaginaryPart = ip;
    }

    public ComplexNumber complexSum(ComplexNumber number) {
        return new ComplexNumber(realPart + number.realPart, imaginaryPart + number.imaginaryPart);
    }

    public ComplexNumber complexMult(ComplexNumber number) {
        double newRealPart = realPart * number.realPart - imaginaryPart * number.imaginaryPart;
        double newImPart = imaginaryPart * number.realPart + realPart * number.imaginaryPart;
        return new ComplexNumber(newRealPart, newImPart);
    }

    public String toString() {
        return realPart + " " + "+" + " " + imaginaryPart + "i";
    }
}
