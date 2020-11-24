package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));

    }

    static int min(int[] arr) {
        int minimal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimal)
                minimal = arr[i];
        }
        return minimal;
    }

}