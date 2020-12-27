package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int minimal_value = Integer.MAX_VALUE;
        int minimal_index = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= minimal_value) {
                minimal_value = arr[i];
                minimal_index = i;
            }

        return minimal_index;
    }

}