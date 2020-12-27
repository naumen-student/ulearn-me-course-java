package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Task04Main {

    public static void main(String[] args) {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
        Map<String, Integer> frequency = new HashMap<>();
        reader.lines()
                .map(String::toLowerCase)
                .flatMap(x -> Stream.of(x.split("[,.\\-! ]")))
                .filter(x -> !x.isEmpty())
                .forEach(key -> {
                    if (!frequency.containsKey(key))
                        frequency.put(key,1);
                    else
                        frequency.put(key, frequency.get(key) + 1);
                });

        frequency.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(x -> System.out.print(x.getKey() + '\n'));
    }

}