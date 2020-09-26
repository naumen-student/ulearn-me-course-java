package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
    }

    static int min(int[] arr) {
        int minNumber = Integer.MIN_VALUE - 1;
        for(int i : arr){
            minNumber = Math.min(minNumber, i);
        }
        return minNumber;
    }

}