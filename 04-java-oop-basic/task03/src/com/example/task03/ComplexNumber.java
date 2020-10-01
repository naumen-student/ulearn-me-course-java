package com.example.task03;

public class ComplexNumber {

    private double x;
    private double y;

    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(x + number.x, y + number.y);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        return new ComplexNumber(x * number.x - y * number.y, y * number.x + x * number.y);
    }

    public String toString() {
        return this.getY() >= 0 ? (this.getX() + "+" + this.getY() + "i") : (this.getX() + "" + this.getY() + "i");
    }
}
