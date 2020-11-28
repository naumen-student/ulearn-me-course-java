package com.example.task03;

public class Complex {
    private final double realPart;
    private final double imaginaryPart;

    public Complex(double realPart) {
        this(realPart, 0);
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex c){
        return new Complex(realPart+c.realPart,
                imaginaryPart+c.imaginaryPart);
    }

    public Complex subtract(Complex c){
        return new Complex(realPart-c.realPart,
                imaginaryPart-c.imaginaryPart);
    }

    public Complex multiply(Complex c){
        return new Complex(realPart*c.realPart - imaginaryPart*c.imaginaryPart,
                realPart*c.imaginaryPart+c.realPart*imaginaryPart);
    }

    public String toString(){
        return String.format("%1$ + i%2$", realPart, imaginaryPart);
    }

    public double abs(){
        return Math.sqrt(realPart*realPart+imaginaryPart*imaginaryPart);
    }

    public Complex divide(Complex c){
        double div = c.realPart*c.realPart + c.imaginaryPart*c.imaginaryPart;
        double firstPart = (realPart*c.realPart+imaginaryPart*c.imaginaryPart)/div;
        double secondPart = (imaginaryPart*c.realPart - realPart*c.imaginaryPart)/div;
        return new Complex(firstPart, secondPart);
    }

    private double argumentPhi(){
        if(realPart<0 & imaginaryPart>0) return Math.atan(imaginaryPart/realPart) + Math.PI;
        if(realPart<0 & imaginaryPart<0) return Math.atan(imaginaryPart/realPart) - Math.PI;
        if(realPart==0 || imaginaryPart == 0) return 0;
        return Math.atan(imaginaryPart/realPart);
    }

    public Complex pow(double power){
        double firstPart = Math.pow(abs(), power)*Math.cos(power*argumentPhi());
        double secondPart = Math.pow(abs(), power)*Math.sin(power*argumentPhi());
        return new Complex(firstPart, secondPart);
    }
}
