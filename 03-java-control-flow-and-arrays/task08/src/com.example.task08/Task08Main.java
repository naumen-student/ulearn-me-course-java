package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        long multi = 1;
        if (arr.length == 0)
            return 0;
        for (int i : arr)
            multi *= i;
        return multi;
    }

}