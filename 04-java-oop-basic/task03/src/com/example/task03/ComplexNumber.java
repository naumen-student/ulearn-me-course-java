package com.example.task03;

public class ComplexNumber {
    public double realPart;
    public double imaginaryPart;

    public ComplexNumber(){}

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber sum(ComplexNumber addendum){
        return new ComplexNumber(realPart + addendum.realPart,
                imaginaryPart + addendum.imaginaryPart);
    }

    public ComplexNumber multiplication(ComplexNumber multiplier){
        return new ComplexNumber(realPart * multiplier.realPart - imaginaryPart * multiplier.imaginaryPart,
                imaginaryPart*multiplier.realPart + realPart*multiplier.imaginaryPart);
    }

    public String toString() {
        return realPart + " + "+ imaginaryPart+"i";
    }

}
