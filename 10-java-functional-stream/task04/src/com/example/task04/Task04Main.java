package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Task04Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.lines()
                .map(String::toLowerCase)
                .flatMap(y -> Arrays.stream(y.split("[^a-zа-яё0-9]+").clone()))
                .filter(str -> !str.isEmpty())
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(x -> System.out.print(x.getKey() + '\n'));
    }

}
