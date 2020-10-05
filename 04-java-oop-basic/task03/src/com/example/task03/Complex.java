package com.example.task03;

public class Complex {
    private double real;
    private double image;

    Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    Complex sum(Complex value) {
        return new Complex(real + value.getReal(), image + value.getImage());
    }

    Complex product(Complex value) {
        return new Complex(real * value.getReal() - image * value.getImage(),
                real * value.getImage() + image * value.getReal());
    }

    public String toString() {
        String string = "";
        if (real != 0) {
            string += real;
            if (image == 0) {
                return string;
            }
            string += image > 0 ? " + " + image : " - " + -image;
            return string += "i";
        }
        return string += image == 0 ? "0" : image + "i";
    }
}
