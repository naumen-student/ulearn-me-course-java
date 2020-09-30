package com.example.task09;
//import java.util.Arrays;

public class Task09Main {
    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));
    }

    static int min(int[] arr) {

        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min)
                min = i;
        }

        return min;

        // так код будет короче:
        // return Arrays.stream(arr).min().getAsInt();
    }
}