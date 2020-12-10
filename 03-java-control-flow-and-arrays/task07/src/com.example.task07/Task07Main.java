package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] myArray = new int[4];
        myArray[0] = 2;
        myArray[1] = 10;
        myArray[2] = 10;
        myArray[3] = 0;
        System.out.println(sum(myArray));
         */
    }

    static int sum(int[] arr) {
        int a = 0;
        for (int j : arr) {
            a += j;
        }
        return a;
    }

}