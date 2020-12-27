package com.example.task03;

class Complex {
    private double real, imag;

    public Complex() {
    }

    public Complex(double realNum, double imagNum) {
        this.imag = imagNum;
        this.real = realNum;
    }

    public Complex add(Complex complexNum) {
        return new Complex(this.real + complexNum.real, this.imag + complexNum.imag);
    }

    public Complex multiply(Complex complexNum) {
        return new Complex(real * complexNum.real - imag * complexNum.imag, real * complexNum.imag + complexNum.real * imag);
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public String toString() {
        return String.format("%s + %si", real, imag);
    }
}