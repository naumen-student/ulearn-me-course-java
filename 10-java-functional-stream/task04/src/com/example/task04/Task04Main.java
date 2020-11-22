package com.example.task04;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task04Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder("");
        while (scanner.hasNext())
            input.append(scanner.next()).append(" ");
        Stream<String> stream = Arrays.stream(input.toString().toLowerCase().split("[^a-zа-я0-9ё]+"));
            stream.collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                    .entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(10)
                    .forEach(x -> System.out.print(x.getKey() + '\n'));
    }
}
