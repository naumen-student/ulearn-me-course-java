package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
    }

    static int min(int[] arr) {
        int min = 2147483647;
        for(int i = 0;i<arr.length;i++)
            if(arr[i]<min)
                min = arr[i];
        return min;
    }

}