package com.example.task03;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double realPart, double imaginaryPart){
        real = realPart;
        imaginary = imaginaryPart;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public ComplexNumber sum(ComplexNumber complexNumber){
        return new ComplexNumber(real + complexNumber.getReal(), imaginary + complexNumber.getImaginary());
    }

    public ComplexNumber multiply(ComplexNumber complexNumber){
        return new ComplexNumber(real * complexNumber.getReal() - imaginary * complexNumber.imaginary
                , real * complexNumber.imaginary + imaginary * complexNumber.getReal());
    }

    public String toString(){
        return String.format("Complex number: real = %f, imaginary = % f", real, imaginary);
    }
}
