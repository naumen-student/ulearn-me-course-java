package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(5,4,3));
    }

    static int getMin(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        if (b < a && b < c) {
            return b;
        }
        if (c < b && c < a) {
            return c;
        } else {
            return a;
        }
    }
}