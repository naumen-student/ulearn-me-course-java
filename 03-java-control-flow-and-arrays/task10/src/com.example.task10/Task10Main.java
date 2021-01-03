package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int min=arr[0];
        int a=0;
        for (int i=1; i<arr.length;i++)
            if (min>arr[i]) min=arr[i];
        for (int i=0; i<arr.length;i++)
            if (min==arr[i]) a=i;
        return a;
    }

}