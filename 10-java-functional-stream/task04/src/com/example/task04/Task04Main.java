package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task04Main {

    public static void main(String[] args) {

        new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .filter(x -> !x.isEmpty())
                .map(String::toLowerCase)
                .flatMap(x -> Stream.of(x.split("\\P{LD}+")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(x -> System.out.print(x.getKey() + "\n"));

    }

}
