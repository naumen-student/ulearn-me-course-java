package com.example.task10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Integer> list =Arrays.stream(arr).boxed().collect(Collectors.toList());
        int min = Arrays.stream(arr).min().getAsInt();
        return list.lastIndexOf(min);
    }

}