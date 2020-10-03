package com.example.task04;

import java.util.Arrays;

public class Task04Main {
    public static void main(String[] args) {
        from0to10000();
    }

    static void from0to10000() {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i : arr){
            System.out.println(i);
        }
    }
}
