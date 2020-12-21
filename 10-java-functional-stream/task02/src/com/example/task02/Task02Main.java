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

        if (n <= 0 || n >= 17)
            throw new IllegalArgumentException();

        return null; // your implementation here

        int bound = (int) Math.pow(2, n);
        return IntStream.iterate(0, x -> x + 1)
                .map(x -> x % bound)
                .map(x -> x ^ (x >> 1));

    }

}
