package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minNumber = -1;
        for (int i = 0; i < arr.length; i++){
            minNumber = arr[i] <= min ? i : minNumber;
            min = Math.min(min, arr[i]);
        }
        return minNumber;
    }

}