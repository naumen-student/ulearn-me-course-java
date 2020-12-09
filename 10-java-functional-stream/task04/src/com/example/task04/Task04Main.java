package com.example.task04;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Task04Main {

    public static void main(String[] args) {
        HashMap<String, Integer> wordsCount = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        br.lines().map(String::toLowerCase).flatMap(y -> Arrays.stream(y.split("[^a-zа-яё0-9]+").clone()))
                .filter(str -> !str.isEmpty()).forEach(currentKey -> {
            if (!wordsCount.containsKey(currentKey))
                wordsCount.put(currentKey, 1);
            else wordsCount.put(currentKey, wordsCount.get(currentKey) + 1);
        });
        wordsCount.entrySet().stream().sorted(Map.Entry.comparingByKey()).sorted(Map.Entry
        .<String, Integer>comparingByValue().reversed()).limit(10).forEach(x -> System.out.print(x.getKey() + '\n'));
    }
}