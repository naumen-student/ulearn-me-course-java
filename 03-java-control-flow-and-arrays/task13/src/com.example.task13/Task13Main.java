package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
    }

    static int[] removeMoreThen1000(int[] arr) {

       if (arr == null || arr.length == 0)
           return arr;
       int count = 0;
       for (int e : arr){
           if (e <= 1000)
               count++;
       }
       int[] result = new int[count];
       int j = 0;
       for (int e: arr){
           if (e <= 1000){
               result[j] = e;
               j++;
           }
       }
        return result;

    }

}