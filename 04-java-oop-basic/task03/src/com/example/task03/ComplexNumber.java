package com.example.task03;

public class ComplexNumber {
    private int realPart;
    private int imaginaryPart;

    public ComplexNumber(){
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public ComplexNumber(int realPart, int imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public int getRealPart(){
        return this.realPart;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber number){
        return new ComplexNumber(this.realPart + number.getRealPart(),
                this.imaginaryPart + number.getImaginaryPart());
    }

    public ComplexNumber multiply(ComplexNumber number){
        return new ComplexNumber(this.realPart * number.getRealPart() - this.imaginaryPart * number.getImaginaryPart(),
                this.realPart * number.getImaginaryPart() + this.imaginaryPart * number.getRealPart());
    }

    public String toString(){
        return String.format("%d + %d", this.realPart, this.imaginaryPart);
    }
}
