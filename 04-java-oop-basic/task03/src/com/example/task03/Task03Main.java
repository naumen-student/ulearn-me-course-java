package com.example.task03;

public class Complex {
    private double imPart, rePart;

    public Complex() {}

    public Complex (double imagePart, double realPart) {
        this.imPart = imagePart;
        this.rePart = realPart;
    }

    public Complex add(Complex complexPart) {
        return new Complex(this.imPart + complexPart.imPart, this.rePart + complexPart.rePart);
    }

    public Complex Multi (Complex complexPart) {
        return new Complex(imPart * complexPart.imPart - rePart * complexPart.rePart,
                rePart * complexPart.rePart + imPart * complexPart.imPart);
    }

    public double getImPart() {
        return this.imPart;
    }

    public double getRePart() {
        return this.rePart;
    }

    public void setImPart (double imPart) {
        this.imPart = imPart;
    }

    public void setRePart(double rePart) {
        this.rePart = rePart;
    }

    public String toString() {
        return String.format("%s + %si", rePart, imPart);
    }
}
