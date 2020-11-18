package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Task04Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            br.lines().
                    flatMap(line -> Arrays.stream(line.split("[\\P{L}]")))
                    .map(String::toLowerCase)
                    .filter(word -> word.length() > 0)
                    .collect(Collectors.toMap(w -> w, w -> 1, Integer::sum))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(10)
                    .forEach(entry -> System.out.print(entry.getKey() + "\n"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
