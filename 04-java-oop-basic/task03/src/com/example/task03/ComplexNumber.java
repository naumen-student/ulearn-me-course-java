package com.example.task03;

public class ComplexNumber {
    private final int real;
    private final int img;

    ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public int getReal() {
        return real;
    }

    public int getImg() {
        return img;
    }

    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(real + c.real, img + c.img);
    }

    public  ComplexNumber multiply(ComplexNumber c) {
        return new ComplexNumber(real * c.real - img * c.img, real * c.img + img * c.real);
    }

    public String toString() {
        if (img >= 0) return real + " + " + img + "i";
        return real + " - " + img + "i";
    }
}
