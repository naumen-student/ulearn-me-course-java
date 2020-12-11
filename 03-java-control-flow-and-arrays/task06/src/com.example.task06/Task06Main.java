package com.example.task06;

import java.util.Arrays;

public class Task06Main {
    public static void main(String[] args) {

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {

        return Arrays.stream(new int[] {a, b, c, d}).max().getAsInt();
    }

}