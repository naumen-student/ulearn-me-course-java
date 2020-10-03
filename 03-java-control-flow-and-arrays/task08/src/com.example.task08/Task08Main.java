package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        try {
            long result = arr[0];
            for (int i = 1; i < arr.length; i++)
                result *= arr[i];
            return result;
        }
        catch (NullPointerException | IndexOutOfBoundsException e) {
            return 0L;
        }
    }

}