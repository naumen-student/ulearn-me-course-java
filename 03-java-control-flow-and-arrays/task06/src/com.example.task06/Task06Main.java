package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
    }

    static int getMax(int a, int b, int c, int d) {
        if (a>b && a>c && a>d)
            return a;
        if (b>c && b>d)
            return d;
        if (c>d)
            return c;
        return d;
    }

}