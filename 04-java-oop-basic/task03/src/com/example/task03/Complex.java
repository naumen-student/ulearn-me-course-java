package com.example.task03;

public class Complex
{
    private final double realPart;
    private final double imagePart;

    public Complex(double real, double imag)
    {
        realPart = real;
        imagePart = imag;
    }

    public double getImagePart() {
        return imagePart;
    }

    public double getRealPart() {
        return realPart;
    }

    public Complex plus(Complex b)
    {
        Complex a = this;
        double real = a.realPart + b.realPart;
        double imag = a.imagePart + b.imagePart;
        return new Complex(real, imag);
    }

    public Complex multiply(Complex number) {
        return new Complex(
                realPart * number.realPart - imagePart * number.imagePart,
                imagePart * number.realPart + realPart * number.imagePart
                );
    }

    @Override
    public String toString() {
        return "Complex{" +
                "realPart=" + realPart +
                ", imagePart=" + imagePart +
                '}';
    }
}
