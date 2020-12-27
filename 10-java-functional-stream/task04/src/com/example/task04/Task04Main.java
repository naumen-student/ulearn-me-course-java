package com.example.task04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task04Main {

    public static void main(String[] args) {

        Comparator<Map.Entry<String, Long>> comparator = Comparator.comparing(x -> -x.getValue());
        comparator = comparator.thenComparing(Map.Entry::getKey);

        readAll()
                .stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(comparator)
                .limit(10)
                .forEach(x -> System.out.print(x.getKey() + "\n"));

    }

    private static ArrayList<String> readAll() {
        Pattern pattern = Pattern.compile("\\W+", Pattern.UNICODE_CHARACTER_CLASS);
        ArrayList<String> result = new ArrayList<>();

        new Scanner(System.in)
                .useDelimiter(pattern)
                .forEachRemaining(x -> result.add(x.toLowerCase()));

        return result;

    }

}
