package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Task04Main {

    public static void main(String[] args) {
        HashMap<String, Integer> countWords = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

        reader.lines().map(String::toLowerCase)
                .flatMap(y -> Arrays.stream(y.split("[^a-zа-яё0-9]+").clone()))
                .filter(str -> !str.isEmpty())
                .forEach(key -> {
                    if (!countWords.containsKey(key))
                        countWords.put(key, 1);
                    else
                        countWords.put(key, countWords.get(key) + 1);
                });

        countWords.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(x -> System.out.print(x.getKey() + '\n'));
    }
}
