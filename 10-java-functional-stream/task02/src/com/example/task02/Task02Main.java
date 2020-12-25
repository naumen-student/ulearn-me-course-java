package com.example.task02;

import java.util.stream.IntStream;

public class Task02Main {

    public static void main(String[] args) {

        cycleGrayCode(4)
                .limit(10)
                .forEach(System.out::println);

    }

    public static IntStream cycleGrayCode(int n) {
        if (n < 1 || n > 16) {
            throw new IllegalArgumentException();
        }
        int maxGrayNumber = (int) (Math.pow(2, n) - 1);
        return IntStream.iterate(0, x -> x + 1)
                .map(x -> {
                    x = x & maxGrayNumber;
                    return x ^ (x >> 1);
                });
    }
}
