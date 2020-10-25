package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber() {};

    public ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber addComplex(ComplexNumber Z1, ComplexNumber Z2){
        ComplexNumber temp = new ComplexNumber();
        temp.real = Z1.real + Z2.real;
        temp.imag = Z1.imag + Z2.imag;
        return temp;
    }

    public ComplexNumber subtractComplex(ComplexNumber Z1, ComplexNumber Z2){
        ComplexNumber temp = new ComplexNumber();
        temp.real = Z1.real - Z2.real;
        temp.imag = Z1.imag - Z2.imag;
        return temp;
    }

    public ComplexNumber multiplyComplex(ComplexNumber Z1, ComplexNumber Z2){
        ComplexNumber temp = new ComplexNumber();
        temp.real = Z1.real * Z2.real - Z1.imag * Z2.imag;
        temp.imag = Z1.real * Z2.imag + Z1.imag * Z2.real;
        return temp;
    }

    public void printComplexNumber()
    {
        String.format("%f + %fi", real, imag);
    }
}