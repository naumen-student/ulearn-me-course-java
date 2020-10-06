package com.example.task03;

public class Complex {
    private final int a;
    private final int b;

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static Complex sum(Complex number1, Complex number2) {
        return new Complex(number1.a + number2.a, number1.b + number2.b);
    }

    public static Complex multiply(Complex number1, Complex number2) {
        return new Complex(number1.a * number2.a - number1.b * number2.b, number1.b * number2.a + number1.a * number2.b);
    }

    public String toString() {
        if (b > 0)
            return String.format("%d+%di", this.a, this.b);
        return String.format("%d%di", this.a, this.b);
    }

}
