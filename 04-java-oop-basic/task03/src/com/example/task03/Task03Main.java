package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex one = new Complex(80, 2);
        Complex two = new Complex(-4, 122);
        Complex m = one.multiply(two);
        Complex s = one.sum(two);
    }
}
