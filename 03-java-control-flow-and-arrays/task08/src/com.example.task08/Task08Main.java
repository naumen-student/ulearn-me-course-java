package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

        int[] arr = new int[2];
        arr[0] = 5_000_000;
        arr[1] = 8_000_000;
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {

        long multyply = 1;
        if (arr == null || arr.length == 0)
            return 0;

        for (int i: arr) {
                 multyply = multyply * i;
        }

        return multyply ;
    }

}