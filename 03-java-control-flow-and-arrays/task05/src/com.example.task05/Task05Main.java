package com.example.task05;

public class Task05Main {
    static int getMin(int a, int b, int c) {
        int x = Integer.MAX_VALUE;
        if (a < x) x = a;
        if (b < x) x = b;
        if (c < x) x = c;
        return x;
    }
}