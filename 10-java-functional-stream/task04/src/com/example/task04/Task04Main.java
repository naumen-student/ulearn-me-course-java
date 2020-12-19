package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task04Main {

    public static void main(String[] args) {
        try (Stream<String> stream = new BufferedReader(new InputStreamReader(System.in)).lines()) {
            stream
                    .filter(x -> x.length() > 0)
                    .map(String::toLowerCase)
                    .flatMap(x -> Arrays.stream(x.split("[^a-zа-яё0-9]+")))
                    .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                    .entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(10)
                    .forEach(x -> System.out.print(x.getKey() + '\n'));
        }
    }

}
