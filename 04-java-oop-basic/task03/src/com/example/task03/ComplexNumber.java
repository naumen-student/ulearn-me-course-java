package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imagPart;

    public ComplexNumber() {
    }

    public ComplexNumber(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    ComplexNumber calculateSum(ComplexNumber complexNum) {
        return new ComplexNumber(realPart + complexNum.realPart,
                imagPart + complexNum.imagPart);
    }

    ComplexNumber multiply(ComplexNumber complexNum) {
        return new ComplexNumber(realPart * complexNum.realPart - imagPart * complexNum.imagPart,
                realPart * complexNum.imagPart + complexNum.realPart * imagPart);
    }

    public String toString() {
        return String.format("%f + %fi", realPart, imagPart);
    }
}
