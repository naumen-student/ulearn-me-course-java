package com.example.task02;

import java.util.stream.IntStream;

public class Task02Main {

    public static void main(String[] args) {

        /*
        cycleGrayCode(2)
                .limit(10)
                .forEach(System.out::println);
        */

    }

    public static IntStream cycleGrayCode(int n) {

        if (n < 1 || n > 16)
            throw new IllegalArgumentException("N must belong to range (1, 16)");
        int size = (int) Math.pow(2, n);
        return IntStream
                .iterate(0, val -> val + 1)
                .map(val -> val % size)
                .map(val -> val ^ (val >> 1));
    }

}
