package com.example.task03;

public class ComplexNumber {
    private double real=0;
    private  double img=0;

    public ComplexNumber() {
    }

    public ComplexNumber( double real, double img){
        this.real = real;
        this.img = img;
    }
    public double getReal(){
        return real;
    }
    public  double getImg(){
        return img;
    }

    public ComplexNumber add(ComplexNumber c) {
        ComplexNumber sum = new ComplexNumber();
        sum.real = real + c.real;
        sum.img = img + c.img;
        return sum;
    }
    public ComplexNumber multiply(ComplexNumber c) {
        ComplexNumber product = new ComplexNumber();
        product.real = (real * c.real) - (img * c.img);
        product.img = (real * c.img) + (img * c.img);
        return product;
    }

    public String toString() {
        if (img>=0)
            return real + "+i" + Math.abs(img);
        else
            return real + "-i" + Math.abs(img);
    }


}
