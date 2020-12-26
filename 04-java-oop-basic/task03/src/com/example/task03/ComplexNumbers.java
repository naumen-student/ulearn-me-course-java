package com.example.task03;

public class ComplexNumbers {

    private final double real;
    private final double imaginary;

    public ComplexNumbers (double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumbers sum(ComplexNumbers complexNumber) {
        return new ComplexNumbers(real + complexNumber.real, imaginary + complexNumber.imaginary);
    }

    public ComplexNumbers multiply(ComplexNumbers complexNumber) {
        return new ComplexNumbers(real * complexNumber.real - imaginary * complexNumber.imaginary,
                real * complexNumber.imaginary + complexNumber.real * imaginary);
    }

    public String toString() {
        return String.format("%f + %fi",real,imaginary);
    }

}
