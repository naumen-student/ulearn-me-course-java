package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(2, 4);
        Complex complex2 = new Complex(3, 12);
        System.out.print("Число 1 =" + complex1.toString());
        System.out.print("Число 2 =" + complex2.toString());
        System.out.print("Сумма =" + complex1.Add(complex2).toString());
        System.out.print("Произведение =" + complex1.Mult(complex2).toString());
    }
}
