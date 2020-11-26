package com.example.task02;

import java.util.stream.IntStream;

public class Task02Main {

    public static void main(String[] args) {
    }

    public static IntStream cycleGrayCode(int n) {
        if (n < 1 || n > 16) throw new IllegalArgumentException();
        return IntStream.iterate(0, x -> {
            if(x >= (int)Math.pow(2,n) - 1)
                return 0;
            else
                return x + 1;
        }).map(x -> x ^(x >> 1));
    }

}
