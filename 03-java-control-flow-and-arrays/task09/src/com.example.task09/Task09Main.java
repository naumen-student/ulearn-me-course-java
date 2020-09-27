package com.example.task09;

import java.util.Arrays;

public class Task09Main {

    static int min(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

}