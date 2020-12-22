package com.example.task03;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber sum(ComplexNumber complexNumber) {
        return new ComplexNumber(real + complexNumber.imaginary, imaginary + complexNumber.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        return new ComplexNumber(real * complexNumber.real - imaginary * complexNumber.imaginary,
                real * complexNumber.real + imaginary * complexNumber.imaginary);
    }

    public String toString() {
        return String.format("%d + %di", real, imaginary);
    }
}

