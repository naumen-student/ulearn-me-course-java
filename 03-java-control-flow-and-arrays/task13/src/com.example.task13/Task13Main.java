package com.example.task13;

public class Task13Main {
    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        int count = 0;
        for (int number: arr){
            if (number <= 1000) count++;
        }
        int[] result = new int[count];
        int item = 0;
        for (int number: arr){
            if (number <= 1000) {
                result[item] = number;
                item++;
            }
        }
        return result;
    }
}