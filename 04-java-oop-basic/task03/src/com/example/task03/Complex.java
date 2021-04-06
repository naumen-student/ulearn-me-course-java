package com.example.task03;

public class Complex {

    private double real;
    private double imaginary;

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

    public void set(Complex n) {
        this.real = n.real;
        this.imaginary = n.imaginary;
    }

    public Complex add(Complex n) {
        return new Complex(this.real + n.real, this.imaginary + n.imaginary);
    }

    public Complex multiply(Complex n) {
        double re = this.real * n.real - this.imaginary * n.imaginary;
        double im = this.real * n.imaginary + this.imaginary * n.real;

        return new Complex(re, im);
    }

    public String toString() {
        return Double.toString(real) + "+" + Double.toString(imaginary) + "i";
    }
}