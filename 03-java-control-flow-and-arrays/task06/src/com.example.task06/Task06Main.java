package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        System.out.println(getMax(1, 2, 3, 4));
    }

    static int getMax(int a, int b, int c, int d) {
        if (a>b & a>c & a>d) return a;
        if (b>a & b>c & b>d) return b;
        if (c>a & c>b & c>d) return c;
        return d;
    }

}