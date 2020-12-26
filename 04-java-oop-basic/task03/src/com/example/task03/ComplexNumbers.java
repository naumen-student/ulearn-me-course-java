package com.example.task03;

public class ComplexNumbers {
    private double re;
    private double im;

    public ComplexNumbers(double re, double im)
    {
        this.re = re;
        this.im = im;
    }

    public ComplexNumbers Sum(ComplexNumbers complexNumber)
    {
        return new ComplexNumbers(re * complexNumber.re, im * complexNumber.im);
    }

    public ComplexNumbers Multiply(ComplexNumbers complexNumber)
    {
        return new ComplexNumbers(re * complexNumber.re, im * complexNumber.im);
    }

    public String toString() {
        return "ComplexNumbers{" +
                "re=" + re +
                ", im=" + im +
                '}' ;
    }
}