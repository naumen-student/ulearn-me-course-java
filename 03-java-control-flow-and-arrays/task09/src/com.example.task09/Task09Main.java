package com.example.task09;

import java.util.Arrays;

public class Task09Main {

    static int min(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return Arrays.stream(arr).min().getAsInt();
    }
}