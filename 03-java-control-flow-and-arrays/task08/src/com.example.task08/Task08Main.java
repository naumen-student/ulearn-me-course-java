package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {


    static long mult(int[] arr) {
            if (arr.length == 0)
                return 0;
            long result = 1L;
            for (int number : arr) result *= number;
            return result;
    }

}