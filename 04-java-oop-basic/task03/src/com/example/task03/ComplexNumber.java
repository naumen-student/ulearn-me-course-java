package com.example.task03;

public class ComplexNumber {

    private double real, imag;

    public ComplexNumber(){
        real = 0;
        imag = 0;
    }

    public ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber add(ComplexNumber num){
        double resReal = real + num.real;
        double resImage = imag + num.imag;
        return new ComplexNumber(resReal, resImage);
    }

    public ComplexNumber mult(ComplexNumber num){
        double resReal = real * num.real + imag * num.imag * -1;
        double resImag = real * num.imag + imag * num.real;
        return new ComplexNumber(resReal, resImag);
    }

    public String toString(){
        return "(" + real + ", " + imag + "i)";
    }
}
