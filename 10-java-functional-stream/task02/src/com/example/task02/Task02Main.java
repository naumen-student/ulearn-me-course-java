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
        if (n > 0 && n < 17) {
            return IntStream.iterate(0, x -> (x + 1) < Math.pow(2, n) ? x + 1 : 0)
                    .map( x -> x ^ (x >> 1));
        } else {
            throw new IllegalArgumentException();
        }
    }

}
