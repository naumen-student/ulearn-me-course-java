package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(realPart + complexNumber.realPart,
                imaginaryPart + complexNumber.imaginaryPart);
    }

    public ComplexNumber multiplication(ComplexNumber complexNumber) {
        double newRealPart = this.realPart * complexNumber.realPart - this.imaginaryPart * complexNumber.imaginaryPart;
        double newImaginaryPart = this.realPart * complexNumber.imaginaryPart + this.imaginaryPart * complexNumber.realPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }
}