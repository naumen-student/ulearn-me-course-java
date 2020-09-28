package com.example.task08;

import java.util.Arrays;

public class Task08Main {
    public static void main(String[] args) {
    }

    static long mult(int[] arr) {
        if (arr.length == 0)
            return 0;
        long numbersProduct = 1;
        for (int j : arr) numbersProduct *= j;
        return numbersProduct;
    }

}