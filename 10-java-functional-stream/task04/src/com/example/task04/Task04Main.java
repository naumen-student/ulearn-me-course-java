package com.example.task04;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Task04Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        Map<String, Integer> freq = new HashMap<>();
        reader.lines().map(x -> x.toLowerCase())
                .flatMap((y -> Arrays.stream(y.split("[^a-zа-яё0-9]+").clone())))
                .filter(x -> !x.equals(""))
                .forEach(x -> {
                    if (freq.containsKey(x)){
                        freq.put(x, freq.get(x)+1);
                    }
                    else
                        freq.put(x, 1);
                });
        freq.entrySet().stream().sorted((x, y) -> {
            if (x.getValue() > y.getValue())
                return -1;
            else if (x.getValue().equals(y.getValue())){
                return x.getKey().compareTo(y.getKey());
            }
            return 1;
        }).map(Map.Entry::getKey).limit(10).forEach(x -> System.out.print(x + '\n'));
    }
}
