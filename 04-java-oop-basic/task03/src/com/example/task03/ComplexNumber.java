package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    ComplexNumber() {
    }

    ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber sumComplexNumbers(ComplexNumber namber) {
        return new ComplexNumber(realPart + namber.realPart,
                imaginaryPart + namber.imaginaryPart);
    }

    public ComplexNumber productComplexNumbers(ComplexNumber number) {
        return new ComplexNumber(realPart * number.realPart - imaginaryPart * number.realPart,
                realPart * number.realPart + imaginaryPart * number.realPart);
    }

    public String toString() {
        return String.format("%f + %fi", realPart, imaginaryPart);
    }
}
