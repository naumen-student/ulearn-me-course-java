package com.example.task03;

public class ComplexNumber {
    private final double imPart;
    private final double realPart;

    public ComplexNumber(double realPart, double imPart) {
        this.imPart = imPart;
        this.realPart = realPart;
    }

    public double getImPart() {
        return imPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(realPart + number.realPart, imPart + number.imPart);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        return new ComplexNumber(realPart * number.realPart - imPart * number.imPart, realPart * number.imPart + imPart * number.realPart);
    }
}