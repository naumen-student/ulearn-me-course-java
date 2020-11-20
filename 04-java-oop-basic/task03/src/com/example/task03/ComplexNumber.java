package com.example.task03;

public class ComplexNumber {
    private double re;
    private double im;

    ComplexNumber() {

    }

    ComplexNumber(double realNum, double imNum) {
        this.re = realNum;
        this.im = imNum;
    }

    public ComplexNumber sum(ComplexNumber complexNum) {
        return new ComplexNumber(this.re + complexNum.re, this.im + complexNum.im);
    }

    public ComplexNumber multiply(ComplexNumber complexNum) {
        return new ComplexNumber(re * complexNum.re - im * complexNum.im,
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
        return "ComplexNumber{" +
                "a=" + re +
                ", bi=" + im +
                '}';
    }
}