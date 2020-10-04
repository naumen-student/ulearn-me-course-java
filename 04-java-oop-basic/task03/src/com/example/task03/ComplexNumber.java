package com.example.task03;

public class ComplexNumber {
    private int realPart;
    private int imaginaryPart;

    public ComplexNumber(int realPart, int imaginaryPart) {
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }

    public void setRealPart(int value) {
        realPart = value;
    }

    public int getRealPart() {
        return realPart;
    }

    public void setImaginaryPart(int value) {
        imaginaryPart = value;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber multiply(ComplexNumber this, ComplexNumber cn) {
        int realPart = this.realPart * cn.realPart - this.imaginaryPart * cn.imaginaryPart;
        int imaginaryPart = this.realPart * cn.imaginaryPart + this.imaginaryPart * cn.realPart;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber sum(ComplexNumber this, ComplexNumber cn) {
        int realPart = this.realPart + cn.realPart;
        int imaginaryPart = cn.imaginaryPart + this.imaginaryPart;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
