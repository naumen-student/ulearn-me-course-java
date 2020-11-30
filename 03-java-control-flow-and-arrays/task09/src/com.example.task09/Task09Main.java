package com.example.task09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task09Main {
    public static void main(String[] args) {
    }

    static int min(int[] arr) {
        List list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return (int) Collections.min(list);
    }

}