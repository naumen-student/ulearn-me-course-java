package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));
         */
    }

    static int min(int[] arr) {
        int swap = 0;
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = 1 ; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        return arr[0];
    }
}