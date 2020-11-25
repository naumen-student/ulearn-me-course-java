package com.example.task03;

public class Task03Main {
    private double x;
    private double y;

    public Task03Main(double re, double im)
    {
        this.x = x;
        this.y = y;
    }

    public double getImPart() {
        return x;
    }

    public double getRealPart() {
        return y;
    }

    public Task03Main Sum(Task03Main number)
    {
        return new Task03Main(x + number.x, y + number.y);
    }

    public Task03Main Multiply(Task03Main complexNumber)
    {
        return new Task03Main(x * complexNumber.x, y * complexNumber.y);
    }

    public String toString() {
        return "ComplexNumbers{" +
                "re=" + x +
                ", im=" + y +
                '}';
    }
}