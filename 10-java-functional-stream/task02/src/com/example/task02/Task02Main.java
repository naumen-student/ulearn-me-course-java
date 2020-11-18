package com.example.task02;

import java.util.ArrayList;
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
        if (n < 1 || n > 16){
            throw new IllegalArgumentException("Битность кодов должна быть задана в пределах от 1 до 16");
        }
        return IntStream.iterate(0, i -> (i + 1) % ((int)Math.pow(2, n)))
                .map(i -> i ^ (i >> 1));
    }

}
