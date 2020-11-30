package com.example.task08;

import java.util.stream.IntStream;

public class Task08Main {
    public static void main(String[] args) {
    }

    static long mult(int[] arr) {
        if (arr.length == 0)
            return 0;
        long result = 1;
        for(int i: arr){
            result*=i;
        }
        return result;
    }

}