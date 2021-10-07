package com.example.task04;

import java.io.;
import java.util.;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task04Main {

    public static void main(String[] args) {
        new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .flatMap(x -> Stream.of(x.split(" |-|\!|\.|\,"))
                        .filter(t -> !t.isEmpty())
                        .map(String::toLowerCase))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .map(Map.Entry::getKey)
                .forEach(x -> System.out.print(x + "\n"));
    }
}