package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {

    }

    static int sum(int[] arr) {
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }

}