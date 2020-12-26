package com.example.task03;

public class Task03Main {
    private double realAxis;
    private double imaginaryAxis;

    public Task03Main(double realAxis, double imaginaryAxis) {
        this.imaginaryAxis = imaginaryAxis;
        this.realAxis = realAxis;
    }

    public Task03Main sum(Task03Main number) {
        return new Task03Main(realAxis + number.realAxis, imaginaryAxis + number.imaginaryAxis);
    }

    public Task03Main multiply(Task03Main number) {
        return new Task03Main(
                realAxis * number.realAxis - imaginaryAxis * number.imaginaryAxis,
                realAxis * number.imaginaryAxis + imaginaryAxis * number.realAxis);
    }

    public String toString() {
        return String.format("%f + %fi", realAxis, imaginaryAxis);
    }
}