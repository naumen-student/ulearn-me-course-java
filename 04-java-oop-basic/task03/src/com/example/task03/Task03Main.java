package com.example.task03;
import java.util.concurrent.Callable;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(3,4);
        ComplexNumber secondNumber = new ComplexNumber(1,2);
        System.out.println(firstNumber.Add(secondNumber));
        System.out.println(firstNumber.Multiply(secondNumber));
    }
}

class ComplexNumber{
    private double realPartNumber;
    private double imagPartNumber;

    public ComplexNumber(double realPartNumber, double imagPartNumber){
        this. realPartNumber = realPartNumber;
        this.imagPartNumber = imagPartNumber;
    }

    public double getRealPartNumber() {
        return realPartNumber;
    }

    public double getImagPartNumber() {
        return imagPartNumber;
    }

    public ComplexNumber Add(ComplexNumber number){
        return new ComplexNumber(realPartNumber + number.realPartNumber,
                imagPartNumber + number.imagPartNumber);
    }

    public ComplexNumber Multiply(ComplexNumber number){
        return new ComplexNumber(realPartNumber * number.realPartNumber
                - imagPartNumber * number.imagPartNumber,
                realPartNumber * number.imagPartNumber
                        + imagPartNumber * number.realPartNumber);

    }

    public String toString(){
        return realPartNumber + " + " + imagPartNumber + "i";
    }
}
