package com.example.task03;

public class ComplexNumber {
    private double a;
    private double bi;

    ComplexNumber() {

    }

    ComplexNumber(double a, double bi) {
        this.a = a;
        this.bi = bi;
    }

    public ComplexNumber sum(ComplexNumber num) {
        return new ComplexNumber(this.a + num.a, this.bi + num.bi);
    }

    public ComplexNumber multiply(ComplexNumber num) {
        return new ComplexNumber(this.a * num.a, - this.bi * num.bi);
    }



}