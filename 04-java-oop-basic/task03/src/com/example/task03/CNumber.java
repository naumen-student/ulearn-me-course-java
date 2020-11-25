package com.example.task03;

public class CNumber {

    private double real;
    private double imagine;

    public CNumber(double real, double imagine){
        this.real = real;
        this.imagine = imagine;
    }

    public CNumber Sum(CNumber number){
        return new CNumber(real + number.real, imagine + number.imagine);
    }

    public CNumber Multiply(CNumber number){
        return new CNumber(real * number.real, imagine * number.imagine);
    }

}