package com.example.task03;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(){

    }
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex Add(Complex other) {
        Complex sum = new Complex();
        sum.real = real + other.real;
        sum.imaginary = imaginary + other.imaginary;
        return sum;
    }

    public Complex Multiply(Complex other) {
        Complex prod = new Complex();
        prod.real = real * other.real - imaginary * other.imaginary;
        prod.imaginary = imaginary * other.real + real * other.imaginary;
        return prod;
    }

    public String toString() {
        return String.format("%f + %fi", real, imaginary);
    }
}
