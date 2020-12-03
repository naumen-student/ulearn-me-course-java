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

    public ComplexNumber sum(ComplexNumber complexNumber){
        return new ComplexNumber(realPart + complexNumber.realPart,
                imaginaryPart + complexNumber.imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber){
        return new ComplexNumber(realPart * complexNumber.realPart - imaginaryPart * complexNumber.imaginaryPart,
                imaginaryPart * complexNumber.realPart + realPart * complexNumber.imaginaryPart);
    }
}
