package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
    }

    static int min(int[] arr) {
        int result = Integer.MAX_VALUE;
        for(int num:arr) {
            if (num < result)
                result = num;
        }
        return result;
    }

}