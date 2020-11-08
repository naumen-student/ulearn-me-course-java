package com.example.task03;

public class ComplexNum {
    private int real;
    private int imaginary;

    public ComplexNum(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNum Multiply(ComplexNum complexNumber)
    {
        return new ComplexNum(real * complexNumber.real, imaginary * complexNumber.imaginary);
    }

    public ComplexNum Sum(ComplexNum complexNumber)
    {
        return new ComplexNum(real + complexNumber.real, imaginary + complexNumber.imaginary);
    }

    public String toString()
    {
        return String.format("%d + %di", real,imaginary);
    }
}
