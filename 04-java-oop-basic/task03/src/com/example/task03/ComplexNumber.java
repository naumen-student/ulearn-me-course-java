package com.example.task03;

public class ComplexNumber {

    private double realAxis;
    private double imaginaryAxis;

    public ComplexNumber(double realAxis, double imaginaryAxis) {
        this.imaginaryAxis = imaginaryAxis;
        this.realAxis = realAxis;
    }

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(realAxis + number.realAxis, imaginaryAxis + number.imaginaryAxis);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        return new ComplexNumber(
                realAxis * number.realAxis - imaginaryAxis * number.imaginaryAxis,
                realAxis * number.imaginaryAxis + imaginaryAxis * number.realAxis);
    }

    public String toString() {
        return String.format("%f + %fi", realAxis, imaginaryAxis);
    }


}
