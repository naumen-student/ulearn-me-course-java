package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task04Main {

    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        List<Map.Entry<String, Long>> listToSort = new ArrayList<>();
        for (Map.Entry<String, Long> stringLongEntry : bufferedReader.lines()
                .flatMap(x -> Stream.of(x.split("[,.\n\\-! ]")))
                .map(String::toLowerCase)
                .filter(x -> !x.isEmpty())
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()) {
            listToSort.add(stringLongEntry);
        }
        listToSort.sort(Map.Entry.comparingByKey());
        List<Map.Entry<String, Long>> toSort = new ArrayList<>();
        for (Map.Entry<String, Long> stringLongEntry : listToSort) {
            toSort.add(stringLongEntry);
        }
        toSort.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        long limit = 10;
        for (Map.Entry<String, Long> stringLongEntry : toSort) {
            if (limit-- == 0) break;
            String key = stringLongEntry.getKey();
            System.out.print(key + "\n");
        }
    }

}
