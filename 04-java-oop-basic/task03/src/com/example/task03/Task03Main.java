package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complix first = new Complix(10,2);
        Complix second = new Complix(2,3);
        Complix sum = new Complix(first.getRl(),first.getIm()).Sum(second);
        Complix mult = new Complix(first.getRl(),first.getIm()).Mult(second);
    }
}
