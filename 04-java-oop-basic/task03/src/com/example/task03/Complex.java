package com.example.task03;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(){
        real = 0;
        imaginary = 0;
    }

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal(){
        return real;
    }

    public void setReal(int real){
        this.real = real;
    }

    public int getImaginary(){
        return imaginary;
    }

    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }

    public Complex add(Complex complex){
        return new Complex(real + complex.real, imaginary + complex.imaginary);
    }

    public Complex multiply(Complex complex){
        return new Complex(real * complex.real - imaginary * complex.imaginary, real * complex.imaginary + imaginary * complex.real);
    }

    public String toString(){
        char sign = imaginary < 0 ? '-' : '+';
        return String.format("%d%s%di", real, sign, Math.abs(imaginary));
    }
}
