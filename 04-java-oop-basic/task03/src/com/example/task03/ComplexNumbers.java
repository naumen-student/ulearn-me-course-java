package com.example.task03;

public class ComplexNumbers {

    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumbers sum(ComplexNumbers complexNumber) {
        return new ComplexNumbers(real + complexNumber.real, imaginary + complexNumber.imaginary);
    }

    public ComplexNumbers multiplication(ComplexNumbers complexNumber) {
        return new ComplexNumbers(real * complexNumber.real, imaginary * complexNumber.imaginary);
    }

    public String toString() {
        return String.format("d + i", real,imaginary);
    }
}
