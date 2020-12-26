package com.example.task12;
import java.util.Arrays;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
    }

    static void selectionSort(int[] arr) {

        if (arr == null)
            return null;
        return Arrays.stream(arr).filter(x -> x <= 1e3).toArray();
    }
}