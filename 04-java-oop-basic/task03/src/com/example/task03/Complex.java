package com.example.task03;

public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    public static Complex sum(Complex a, Complex b) {
        return new Complex(a.getRe() + b.getRe(), a.getIm() + b.getIm());
    }
    public static Complex multiply(Complex a, Complex b) {
        return new Complex(a.getRe() * b.getRe() - a.getIm() * b.getIm(), a.getRe() * b.getIm() + a.getIm() * b.getRe());
    }



}
