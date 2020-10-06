package com.example.task03;

class ComplexNumber {

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
public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5, 9);
        ComplexNumber b = new ComplexNumber(2, -14);
        System.out.println((a.sum(b)).toString());
        System.out.println((a.multiply(b)).toString());
    }
}