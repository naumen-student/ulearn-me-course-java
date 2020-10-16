package com.example.task03;

public class Task03Main {
    public static void main(String[] args){
        ComplexNumber a = new ComplexNumber(5, 10);
        ComplexNumber b = new ComplexNumber(6, 7);
        System.out.println(a.sum(b).toString());
        System.out.println(a.multiplication(b).toString());
    }
}
