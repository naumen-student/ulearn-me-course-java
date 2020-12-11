package com.example.task03;

public class ComplexNumber {
    private double realNumber;
    private double imaginaryNumber;

    public ComplexNumber(double realNumber, double complexNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = complexNumber;
    }

    public void setRealNumber(double realNumber) {
        this.realNumber = realNumber;
    }

    public double getRealNumber() {
        return realNumber;
    }

    public void setImaginaryNumber(double imaginaryNumber) {
        this.imaginaryNumber = imaginaryNumber;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(realNumber + complexNumber.realNumber,
                imaginaryNumber + complexNumber.imaginaryNumber);
    }

    public ComplexNumber multiple(ComplexNumber complexNumber) {
        return new ComplexNumber(
                realNumber * complexNumber.realNumber - imaginaryNumber * complexNumber.imaginaryNumber,
                realNumber * complexNumber.imaginaryNumber + complexNumber.realNumber * imaginaryNumber);
    }

    public String toString() {
        return String.format("real %f imaginary %f", realNumber, imaginaryNumber);
    }
}

