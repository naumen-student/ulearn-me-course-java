package com.example.task06;

import java.util.Arrays;

public class Task06Main {
    public static void main(String[] args) {

    }

    static int getMax(int a, int b, int c, int d) {
        return a > b && a > c && a > d ? a
                : b > c && b > d ? b
                : c > d ? c : d;
    }

}