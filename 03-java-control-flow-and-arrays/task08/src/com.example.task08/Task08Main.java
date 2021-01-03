package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

    }

    static long mult(int[] arr) {
        long mult = 1;
        if (arr.length > 0)
            for (int i : arr)
                mult *= i;
        else return 0;
        return mult;
    }

}