package com.example.task03;

class Complex {
    public int real;
    public int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex sum(Complex complex) {
        return new Complex(real + complex.real, imaginary + complex.imaginary);
    }

    public Complex multiply(Complex complex) {
        return new Complex((real * complex.real - imaginary * complex.imaginary),
                (real * complex.imaginary + imaginary * complex.real));
    }

    public String toString() {
        if (imaginary >= 0)
            return String.format("%d + %dj", real, imaginary);
        else
            return String.format("%d - %dj", real, Math.abs(imaginary));
    }
}

public class Task03Main {
    public static void main(String[] args) {
        Complex first = new Complex(3, -2);
        Complex second = new Complex(4, 1);
        Complex sum = first.sum(second);
        Complex multiply = first.multiply(second);
        System.out.println(first);
        System.out.println(second);
        System.out.println(sum);
        System.out.println(multiply);
    }
}
