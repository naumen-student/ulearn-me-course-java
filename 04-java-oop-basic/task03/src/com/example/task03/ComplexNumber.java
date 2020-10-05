package com.example.task03;

public class Complex {

    private final int realPart;
    private final int imagPart;

    public Complex(int re, int im) {
        this.realPart = re;
        this.imagPart = im;
    }

    public int getRe(){
        return realPart;
    }

    public int getIm() {
        return imagPart;
    }

    public Complex add(Complex complex) {
        int newRealPart = this.realPart + complex.realPart;
        int newImagPart = this.imagPart + complex.imagPart;
        return new Complex(newRealPart, newImagPart);
    }

    public Complex multiply(Complex complex) {
        int newRealPart1 = this.realPart * complex.realPart - this.imagPart * complex.imagPart;
        int newImagPart1 = this.imagPart * complex.realPart + this.realPart * complex.imagPart;
        return new Complex(newRealPart1, newImagPart1);
    }

    public String toString() {
        String sign = " + ";
        int imForPrint = this.imagPart;
        if (Integer.toString(this.imagPart).charAt(0) == '-') {
            sign = " - ";
            imForPrint *= -1;
        }
        return this.realPart + sign + imForPrint + "i";
    }
}
