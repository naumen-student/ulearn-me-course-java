package com.example.task10;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        IntStream stream = Arrays.stream(arr);
        int min = stream.min().getAsInt();
        for (int i = arr.length-1; i >=0 ; i--)
            if (arr[i]==min)
                return  i;
        return  -1;
    }

}