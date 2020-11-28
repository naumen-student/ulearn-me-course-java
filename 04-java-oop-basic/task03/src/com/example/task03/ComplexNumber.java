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

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(realPart + number.realPart, imaginaryPart + number.imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        return new ComplexNumber(realPart * number.realPart - imaginaryPart * number.imaginaryPart,
                realPart * number.imaginaryPart + number.realPart * imaginaryPart);
    }

    public String toString() {
        return Double.toString(realPart) + "+" + Double.toString(imaginaryPart) + "i";
    }
}
