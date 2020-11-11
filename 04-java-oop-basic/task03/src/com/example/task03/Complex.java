package com.example.task03;

public class Complex {
    private int real;
    private int im;

    public Complex(int real, int im){
        this.real = real;
        this.im = im;
    }

    public Complex Multiply(Complex complex){
        return new Complex(real * complex.real, im * complex.im);
    }

    public Complex Sum(Complex complex){
        return new Complex(real + complex.real, im + complex.im);
    }

    public String toString()
    {
        return String.format("%d + %di", real, im);
    }
}
