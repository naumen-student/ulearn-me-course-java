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
        int number = 0;
        int minValue = Integer.MAX_VALUE;
        for (int j = 0; j < arr.length; j++)
            if (arr[j] <= minValue) {
                minValue = arr[j];
                number = j;
            }
        return number;
    }

}