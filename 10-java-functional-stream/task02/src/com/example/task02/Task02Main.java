package com.example.task02;

import java.util.stream.IntStream;

public class Task02Main {
    public static IntStream cycleGrayCode(int n) {
        if (n < 1 || n > 16)
            throw new IllegalArgumentException();
        int max = (int) Math.pow(2, n);
        return IntStream.iterate(0, i -> i + 1)
                .map(x -> (x % max) ^ ((x % max) >> 1));
    }
}
