package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
         Complex complex1 = new Complex(3.0, 4.6);
         Complex complex2 = new Complex(9.9, 6.5);
         Complex summ = complex1.sum(complex2);
         Complex mip = complex1.multipl(complex2);
         System.out.println(summ);
         System.out.println(mip);
    }
}
