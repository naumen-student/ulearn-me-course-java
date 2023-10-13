package com.example.task08;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {
        if (arr.length == 0) return 0;
        final long[] mult = {1};
        IntConsumer intConsumer = value -> mult[0] *= value;
        Arrays.stream(arr).forEach(intConsumer);
        return mult[0];
    }

}