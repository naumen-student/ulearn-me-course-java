package com.example.task07;

import java.util.stream.IntStream;

public class Task07Main {
    public static void main(String[] args) {
    }

    static int sum(int[] arr) {
        return IntStream.of(arr).sum();
    }

}