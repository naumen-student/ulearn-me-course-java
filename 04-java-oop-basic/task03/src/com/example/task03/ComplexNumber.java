package com.example.task03;

public class ComplexNumber {

    private double real;
    private double imagine;

    public ComplexNumber(double real, double imagine){
        this.real = real;
        this.imagine = imagine;
    }

    public ComplexNumber findSum(ComplexNumber complexNumber){
        return new ComplexNumber(real + complexNumber.real, imagine + complexNumber.imagine);
    }

    public ComplexNumber findMultiply(ComplexNumber complexNumber){
        return new ComplexNumber(real * complexNumber.real, imagine * complexNumber.imagine);
    }

}