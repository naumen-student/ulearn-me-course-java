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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int min_v = arr[arr.length-1];
        int id = arr.length-1;
        for(int i= arr.length-2;i>=0; i--)
            if (arr[i]<min_v) {
                min_v = arr[i];
                id = i;
            }
        return id;
    }

}