package com.example.task03;

class Complex{
    public Complex (double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    private double real;
    private double imaginary;

    public Complex sum(Complex complex){
        return new Complex(complex.real + this.real, complex.imaginary + this.imaginary);
    }

    public Complex subtract(Complex complex){
        return new Complex(this.real - complex.real, this.imaginary - complex.imaginary);
    }

    public Complex multiply(Complex complex){
        return new Complex(this.real * complex.real - this.imaginary * complex.imaginary,
                this.imaginary * complex.real + this.real * complex.imaginary);
    }

    public Complex division(Complex complex){
        double squareParts = Math.pow(complex.real, 2) + Math.pow(complex.imaginary, 2);
        if (squareParts == 0)
            return null;
        double newReal = (complex.real * this.real + complex.imaginary * this.imaginary) / squareParts;
        double newImaginary = (this.imaginary * complex.real - this.real * complex.imaginary) / squareParts;
        return new Complex(newReal, newImaginary);
    }

    public String toString(){
        return this.real +"+"+ this.imaginary +"i";
    }

}

public class Task03Main {
    public static void main(String[] args){
        Complex complex1 = new Complex(2, 3);
        Complex complex2 = new Complex(4, 7);
        System.out.println(complex1.sum(complex2).toString());
        System.out.println(complex1.multiply(complex2).toString());
    }
}
