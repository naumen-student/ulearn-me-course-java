package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart(){
        return realPart;
    }

    public double getImaginaryPart(){
        return imaginaryPart;
    }

    public ComplexNumber sum(ComplexNumber number){
        return new ComplexNumber(realPart + number.realPart,
                imaginaryPart + number.imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber number){
        return new ComplexNumber(realPart * number.realPart - imaginaryPart * number.imaginaryPart,
                imaginaryPart * number.realPart + realPart * number.imaginaryPart);
    }
}
