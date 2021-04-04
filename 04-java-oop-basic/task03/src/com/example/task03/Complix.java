package com.example.task03;

public class Complix{
    private double rl;
    private double im;

    public Complix(double rl, double im){
        this.rl = rl;
        this.im = rl;
    }

    public double getIm() {
        return im;
    }

    public double getRl() {
        return rl;
    }

    public Complix Sum(Complix c){
        return new Complix(c.rl + rl, c.im + im);
    }

    public Complix Mult(Complix c){
        return new Complix(2 * rl * c.rl - im * c.im , rl * c.im + c.rl * im);
    }


}