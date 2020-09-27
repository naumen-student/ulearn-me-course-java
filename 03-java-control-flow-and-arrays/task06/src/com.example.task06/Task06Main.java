package com.example.task06;

public class Task06Main {
    static int getMax(int a, int b, int c, int d) {
        int x = Integer.MIN_VALUE;
        if (a > x) x = a;
        if (b > x) x = b;
        if (c > x) x = c;
        if (d > x) x = d;
        return x;
    }
}