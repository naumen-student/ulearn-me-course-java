package com.example.task03;

public class Complex {
    private final int real;
    private final int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex sum(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    public Complex multiply(Complex c) {
        return new Complex(real * c.real - imaginary * c.imaginary, real * c.imaginary + c.real * imaginary);
    }
}
