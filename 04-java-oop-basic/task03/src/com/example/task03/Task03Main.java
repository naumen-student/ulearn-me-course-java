package com.example.task03;
class ComplexNumber {

    private double a;  //Real part
    private double b;  //Imaginary part

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public ComplexNumber toGetSum(ComplexNumber number) {
        return new ComplexNumber(a + number.a, b + number.b);
    }

    public ComplexNumber toGetMultiplication(ComplexNumber number) {
        return new ComplexNumber(a * number.a - b * number.b, b * number.a + a * number.b);
    }

    public String toString(){
        return String.format("%d + %d", this.a, this.b);
    }
}
