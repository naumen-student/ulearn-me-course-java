package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {

    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int element : arr)
            if (element < min)
                min = element;
            return min;
    }

}