package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {

        int x = Integer.compare(a, b) == 1 ? a : b;
        int y = Integer.compare(c, d) == 1 ? c : d;
        return Integer.compare(x, y) == 1 ? x : y;

    }
}