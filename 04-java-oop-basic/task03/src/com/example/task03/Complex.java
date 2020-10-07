package com.example.task03;

public class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String toString() {
        return String.format("%1$ + i%2$", real, imaginary);
    }

    public Complex Add(Complex addComplex) {
        return new Complex(real + addComplex.real, imaginary + addComplex.imaginary);
    }

    public Complex Mult(Complex addComplex) {
        return new Complex(real * addComplex.real - imaginary * addComplex.imaginary,
                real * addComplex.imaginary + imaginary * addComplex.real);
    }
}
