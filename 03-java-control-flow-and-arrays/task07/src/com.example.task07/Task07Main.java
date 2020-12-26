package com.example.task07;

import java.util.Arrays;

    public class Task07Main {

        static int sum(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return Arrays.stream(arr).sum();
        }
}