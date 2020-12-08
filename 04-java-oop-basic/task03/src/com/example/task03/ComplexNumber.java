package com.example.task03;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(real + complexNumber.real,
                imaginary + complexNumber.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        return new ComplexNumber(real * complexNumber.real - imaginary * complexNumber.imaginary,
                imaginary * complexNumber.real + real * complexNumber.imaginary);
    }

    @Override
    public String toString() {
        return "z = " + real + " + i" + imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
}