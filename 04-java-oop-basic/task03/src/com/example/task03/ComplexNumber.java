package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double a, double b){
        this.realPart = a;
        this.imaginaryPart = b;
    }
    public ComplexNumber sum(ComplexNumber number){
        return new ComplexNumber(this.realPart + number.realPart, this.imaginaryPart + number.imaginaryPart);
    }
    public ComplexNumber multiply(ComplexNumber number){
        return new ComplexNumber(this.realPart*number.realPart - this.imaginaryPart * number.imaginaryPart, this.realPart*number.imaginaryPart + this.imaginaryPart * number.realPart);
    }
}
