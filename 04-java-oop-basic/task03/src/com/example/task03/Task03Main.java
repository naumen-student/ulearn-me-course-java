package com.example.task03;

public class Complex {
    protected double real, imag;

    public Complex() { }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        if (imag >= 0)
            return real + "+" + imag + "i";
        else
            return real + "-" + -imag + "i";
    }

    public Complex Add(Complex complexPart) {
        Complex sum = new Complex();
        sum.real = real + complexPart.real;
        sum.imag = imag + complexPart.imag;
        return (sum);
    }

    public Complex Mult(Complex complexPart) {
        Complex res = new Complex();
        res.real = real * complexPart.real - imag * complexPart.imag;
        res.imag = imag * complexPart.real + real * complexPart.imag;
        return (res);
    }

}
