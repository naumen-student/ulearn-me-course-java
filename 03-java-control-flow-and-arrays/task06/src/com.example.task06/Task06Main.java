package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {
        int x = Math.max(a,b);
        int y = Math.max(c,d);
        return Math.max(x,y);
    }

}