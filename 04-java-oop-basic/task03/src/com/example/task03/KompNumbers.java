package com.example.task03;

public class KompNumbers {

    private double real, no_real;

    public KompNumbers(double real, double no_real){
        this.real = real;
        this.no_real = no_real;
    }

    public KompNumbers Summa(KompNumbers number){
        return new KompNumbers(real + number.real, no_real + number.no_real);
    }

    public KompNumbers Multiply(KompNumbers number){
        return new KompNumbers(real * number.real, no_real * number.no_real);
    }
}