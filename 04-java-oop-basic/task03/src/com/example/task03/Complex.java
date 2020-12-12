package com.example.task03;

public class Complex {
    private int truePart;
    private int imaginePart;

    public Complex(int realPart, int imaginePart){
        this.truePart = realPart;
        this.imaginePart = imaginePart;
    }

    public int getRealPart(){
        return truePart;
    }

    public int getImaginePart(){
        return imaginePart;
    }

    public Complex add(Complex complex){
        return new Complex(truePart + complex.truePart,
                imaginePart + complex.imaginePart);
    }

    public Complex multiply(Complex complex){
        return new Complex(truePart * complex.truePart - imaginePart * complex.imaginePart,
                imaginePart * complex.truePart + truePart * complex.imaginePart);
    }

    public String toString(){
        return "Complex{" +
                "realPart=" + truePart +
                ", imaginePart=" + imaginePart +
                '}';
    }
}
