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
        if (arr.length == 0) return 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) if (arr[i] < min) min = arr[i];
        return min;
    }

}