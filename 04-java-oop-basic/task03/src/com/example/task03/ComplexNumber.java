package com.example.task03;

public class ComplexNumber {
    private double imaginePart;
    private double realPart;

    public ComplexNumber(double imaginePart, double realPart){
        this.imaginePart = imaginePart;
        this.realPart = realPart;
    }

    public ComplexNumber sum(ComplexNumber second){
        return new ComplexNumber(imaginePart + second.imaginePart,
        realPart + second.realPart);
    }

    public ComplexNumber multiply(ComplexNumber second){
        return new ComplexNumber( second.realPart * imaginePart + realPart * second.imaginePart ,
                -(imaginePart * second.imaginePart) + realPart * second.realPart);
    }

    public String toString(){
        return "imaginePart:" + imaginePart + "i" + ", " + "RealPart:" + realPart;
    }
}
