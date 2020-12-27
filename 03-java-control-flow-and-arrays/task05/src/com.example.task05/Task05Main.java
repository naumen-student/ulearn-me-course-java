package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        System.out.println(getMin(1,2,3));

    }

    static int getMin(int a, int b, int c) {
        int x = Integer.compare(a, b) == 1 ? b : a;
        return Integer.compare(x, c) == 1 ? c : x;
    }
}