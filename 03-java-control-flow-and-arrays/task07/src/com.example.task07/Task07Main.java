package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {
        int[] myArray = new int[6];
        myArray[0] = 2;
        myArray[1] = 30;
        myArray[2] = 19;
        myArray[3] = 21;
        myArray[4] = 12;
        myArray[5] = 66;
        System.out.println(sum(myArray));
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int value: arr)
            sum += value;
        return sum;
    }

}