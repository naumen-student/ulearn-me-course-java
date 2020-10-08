package com.example.task03;

public class ComplexNumber {

    private double Re;
    private double Im;

    public ComplexNumber(double realNumber, double complexNumber) {
        this.Re = realNumber;
        this.Im = complexNumber;
    }

    public void setIm(double im) { Im = im; }

    public void setRe(double re) { Re = re; }

    public double getIm() { return Im; }

    public double getRe() { return Re; }

    public ComplexNumber add(ComplexNumber num) {
        return new ComplexNumber(Re + num.Re,
                Im + num.Im);
    }

    public ComplexNumber multiple(ComplexNumber num) {
        return new ComplexNumber(Re * num.Re - Im * num.Im,
                Re * num.Im + num.Re * Im);
    }

}
