package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null)
            return null;
        return Arrays.stream(arr).filter(x -> x <= 1e3).toArray();
    }

}