package com.example.task03;

public class ComplexNum {

    private double real;
    private double imaginary;

    public ComplexNum(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void set(ComplexNum n) {
        this.real = n.real;
        this.imaginary = n.imaginary;
    }

    public ComplexNum add(ComplexNum n) {
        return new ComplexNum(this.real + n.real, this.imaginary + n.imaginary);
    }

    public ComplexNum multiply(ComplexNum n) {
        double re = this.real * n.real - this.imaginary * n.imaginary;
        double im = this.real * n.imaginary + this.imaginary * n.real;

        return new ComplexNum(re, im);
    }

    public String toString() {
        return Double.toString(real) + "+" + Double.toString(imaginary) + "i";
    }
}