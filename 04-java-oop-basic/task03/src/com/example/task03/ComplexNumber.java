package com.example.task03;

public class ComplexNumber {
    private float real;
    private float imaginary;

    public ComplexNumber(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber sum(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(real * other.real - imaginary * other.imaginary, imaginary * other.real + real * other.imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImaginary() {
        return imaginary;
    }

    public void setImaginary(float imaginary) {
        this.imaginary = imaginary;
    }
}
