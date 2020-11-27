package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task04Main {

    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        read.lines()
                .flatMap(x -> Stream.of(x.toLowerCase().split("[^A-zA-Zа-яА-ЯёЁ0-9]")).filter(y -> !y.isEmpty()))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry :: getKey))
                .sorted(Comparator.comparing(Map.Entry<String, Long> :: getValue).reversed())
                .limit(10)
                .forEach(x -> System.out.print(x.getKey() + "\n"));
    }
}
