package com.example.task03;

public class Complex {
    private double re, im;

    public Complex() { }

    public Complex(double realNum, double imNum) {
        this.im = imNum;
        this.re = realNum;
    }

    public Complex add(Complex complexNum) {
        return new Complex(this.re + complexNum.re, this.im + complexNum.im);
    }

    public Complex multiply(Complex complexNum) {
        return new Complex(re * complexNum.re - im * complexNum.im,
                re * complexNum.im + complexNum.re * im);
    }

    public double getIm() {
        return this.im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double getRe() {
        return this.re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public String toString() {
        return String.format("%s + %si", re, im);
    }
}
