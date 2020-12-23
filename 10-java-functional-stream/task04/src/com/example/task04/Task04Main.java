package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Task04Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> frequency = new HashMap<>();
        in.lines().map(String::toLowerCase)
                .flatMap(x -> Stream.of(x.split("[,.\\-! ]")))
                .filter(s -> !s.isEmpty())
                .forEach(s -> {
                    if (!frequency.containsKey(s))
                        frequency.put(s, 1);
                    else
                        frequency.put(s, frequency.get(s) + 1);
                });
        frequency.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(x -> System.out.print(x.getKey() + "\n"));

    }

}
