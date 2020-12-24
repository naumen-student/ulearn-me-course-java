package com.example.task03;

public class ComplexNumber {
    double Re;
    double Im;

    public ComplexNumber(double re, double im) {
        Re = re;
        Im = im;
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(Re + number.Re, Im + number.Im);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double newRe = 0;
        double newIm = 0;
        newRe += Re * number.Re;
        newIm += Re * number.Im;
        newIm += Im * number.Re;
        newRe -= Im * number.Im;

        return new ComplexNumber(newRe, newIm);
    }
}