package com.example.task09;

import java.util.Arrays;
import java.util.OptionalInt;

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
        OptionalInt streamed = Arrays.stream(arr).min();
        if (streamed.isPresent()) return streamed.getAsInt();
        else return 0;
    }

}