package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b),Math.max(c,d));
    }

}
