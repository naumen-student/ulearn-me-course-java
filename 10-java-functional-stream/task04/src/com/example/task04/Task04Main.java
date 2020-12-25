package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task04Main {

    public static void main(String[] args) {
        Map<String, Integer> wordsCount = new HashMap<>();
        new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .flatMap(line -> Arrays.stream(line.split("[\\s-!,.]+")))
                .map(String::toLowerCase)
                .forEach(word -> {
                    if (word.length() > 0) {
                        if (wordsCount.containsKey(word)) {
                            wordsCount.put(word, wordsCount.get(word) + 1);
                        } else {
                            wordsCount.put(word, 1);
                        }
                    }
                });
        wordsCount
                .entrySet()
                .stream()
                .sorted((entry1, entry2) -> {
                    int result = entry2.getValue() - entry1.getValue();
                    if (result == 0) {
                        return entry1.getKey().compareTo(entry2.getKey());
                    }
                    return result;
                })
                .limit(10)
                .forEach(entry -> System.out.printf("%s\n", entry.getKey()));
    }
}
