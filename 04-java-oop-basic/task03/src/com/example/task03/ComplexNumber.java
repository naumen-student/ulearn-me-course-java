package com.example.task03;

public class ComplexNumber {
    private double real, imagine;

    public ComplexNumber(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(real + number.real, imagine + number.imagine);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        return new ComplexNumber(real * number.real, imagine * number.imagine);
    }
}
