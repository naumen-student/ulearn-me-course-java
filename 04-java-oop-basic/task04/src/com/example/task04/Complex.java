package com.example.task03;

public class Complex{
    private final int rl;
    private final int im;

    public Complex(int rl, int im){
        this.rl = rl;
        this.im = im;
    }

    public void setRl(int rl){this.rl = rl;}
    public void setIm(int im){this.im = im;}

    public int getRl(){return rl;}
    public int getIm(){return im;}

    public Complex Sum(Complex complex){
        return new Complex(rl + complex.rl, im + complex.im);
    }

    public Complex Mult(Complex complix){
        return new Complex(rl * complix. - im * complix.im, rl * complix.im + complix.rl * im);
    }

    public String toString(){
        return rl+" + " + im + "i";
    }
}