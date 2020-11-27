package com.example.task03;

public class ComplexNumber {
    //z = x + iy, где x и y действительные числа, а i^2 = -1
    private int x;
    private int y;

    public ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getX() + b.getX(), a.getY() + b.getY());
    }

    public static ComplexNumber multiplication(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getX() * b.getX() - a.getY() * b.getY(), a.getX() * b.getY() + a.getY() * b.getX());
    }

    @Override
    public String toString() {
        return "z = " + x + " + i" + y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
