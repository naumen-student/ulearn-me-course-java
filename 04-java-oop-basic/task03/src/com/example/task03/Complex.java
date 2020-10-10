package com.example.task03;

public class Complex {
    protected double real, imaginary;

    public Complex() {
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String toString() {
        if (imaginary >= 0)
            return real + "+" + imaginary + "i";
        else
            return real + "-" + -imaginary + "i";
    }

    public Complex Add(Complex cB) {
        Complex sum = new Complex();

        sum.real = real + cB.real;
        sum.imaginary = imaginary + cB.imaginary;

        return (sum);
    }

    public Complex Mult(Complex cB) {
        Complex prod = new Complex();

        prod.real = real * cB.real - imaginary * cB.imaginary;
        prod.imaginary = imaginary * cB.real + real * cB.imaginary;

        return (prod);
    }

}
