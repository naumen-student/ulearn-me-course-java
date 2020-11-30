package com.example.task03;

public class Complex{ // Re + i * Im
    private int re;
    private int im;

    public Complex(int re, int im){
        this.re = re;
        this.im = im;
    }

    public static Complex sum(Complex a, Complex b){
        return new Complex(a.get_re() + b.get_re(),a.get_im()+ b.get_im());
    }

    public static Complex sub(Complex a, Complex b){
        return new Complex(a.get_re() - b.get_re(),a.get_im() - b.get_im());
    }

    public static Complex multiplication(Complex a, Complex b){
        int re1 = a.get_re();
        int re2 = b.get_re();
        int im1 = a.get_im();
        int im2 = b.get_im();

        return new Complex(re1*re2 - im2*im1, re1*im2 + re2*im1);
    }

    public void set_re(int re){
        this.re = re;
    }

    public void set_im(int im){
        this.im = im;
    }

    public int get_re(){
        return re;
    }

    public int get_im(){
        return im;
    }
}