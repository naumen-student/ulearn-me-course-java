package com.example.task03;

public class ComplexNumber {
    public double realPart;
    public double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber plus(ComplexNumber num){
        double real = realPart + num.realPart;
        double imaginary = imaginaryPart + num.imaginaryPart;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber multiply(ComplexNumber num){
        double real = realPart * num.realPart - imaginaryPart * num.imaginaryPart;
        double imaginary = realPart * num.imaginaryPart + imaginaryPart * num.realPart;
        return new ComplexNumber(real, imaginary);
    }

    public String toString(){
        return String.valueOf(realPart) +
                (imaginaryPart > 0 ? " + " + imaginaryPart: imaginaryPart) + "i";
    }

}

class Program{
    public static void main(String[] args){
        ComplexNumber a = new ComplexNumber(3, 4);
        ComplexNumber b = new ComplexNumber(5, -6);

        System.out.println(a.plus(b).toString());
        System.out.println(a.multiply(b).toString());
    }

}
