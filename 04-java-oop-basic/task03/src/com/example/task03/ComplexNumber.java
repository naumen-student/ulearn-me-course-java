package com.example.task03;

public class ComplexNumber {
    int real;
    int imaginary;

    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber sum(ComplexNumber complexNumber){
        return new ComplexNumber(this.real + complexNumber.real, this.imaginary + complexNumber.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber){
        return new ComplexNumber(this.real * complexNumber.real - this.imaginary * complexNumber.imaginary,
                this.real * complexNumber.imaginary + complexNumber.real * this.imaginary);
    }

    public String toString() {
        return String.format("%d + %di", real, imaginary);
    }

    void print() {
        System.out.println(this.toString());
    }
}
