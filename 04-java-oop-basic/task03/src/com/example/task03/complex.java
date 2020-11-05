package com.example.task03;

public class complex {

    private double re;
    private double im;

    complex(double re, double im) {
        this.im = im;
        this.re = re;
    }

    public complex csum(complex sum) {
        return new complex(re + sum.re, im + sum.im);
    }

    public complex cfactor(complex factor) {
        return new complex(re * factor.re - im * factor.re, re * factor.re + im * factor.re);
    }
}
