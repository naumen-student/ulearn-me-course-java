package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(real + number.real, imaginary + number.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        return new ComplexNumber(
                real * number.real - imaginary * number.imaginary,
                real * number.imaginary + imaginary * number.real);
    }

    public String toString() {
        return String.format("%f + %fi", real, imaginary);
    }
}
