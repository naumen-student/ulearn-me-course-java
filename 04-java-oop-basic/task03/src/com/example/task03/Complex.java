package com.example.task03;

public class Complex{
    private int realPart;
    private int imaginePart;

    public Complex(int realPart, int imaginePart){
        this.realPart = realPart;
        this.imaginePart = imaginePart;
    }

    public int getRealPart(){
        return realPart;
    }

    public int getImaginePart(){
        return imaginePart;
    }

    public Complex add(Complex complex){
        return new Complex(realPart + complex.realPart,
                imaginePart + complex.imaginePart);
    }

    public Complex multiply(Complex complex){
        return new Complex(realPart * complex.realPart - imaginePart * complex.imaginePart,
                imaginePart * complex.realPart + realPart * complex.imaginePart);
    }

    @Override
    public String toString(){
        return "Complex{" +
                "realPart=" + realPart +
                ", imaginePart=" + imaginePart +
                '}';
    }
}
