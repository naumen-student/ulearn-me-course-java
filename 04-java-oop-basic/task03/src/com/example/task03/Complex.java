package com.example.task03;

public class Complex {

    private final int re;
    private final int im;

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public int getRe(){
        return re;
    }

    public int getIm() {
        return im;
    }

    public Complex add(Complex complex) {
        int newRe = this.re + complex.re;
        int newIm = this.im + complex.im;
        return new Complex(newRe, newIm);
    }

    public Complex multiply(Complex complex) {
        int newRe = this.re * complex.re - this.im * complex.im;
        int newIm = this.im * complex.re + this.re * complex.im;
        return new Complex(newRe, newIm);
    }

    public String toString() {
        String sign = " + ";
        int imForPrint = this.im;
        if (Integer.toString(this.im).charAt(0) == '-') {
            sign = " - ";
            imForPrint *= -1;
        }
        return this.re + sign + imForPrint + "i";
    }
}