package com.example.task04;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;

public class Task04Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        List<String> str2 = new ArrayList<>();
        reader.lines().map(x -> x.toLowerCase().split("[ !,.?_-]")).forEach(x -> str2.addAll(Arrays.asList(x)));
        Map<String, Integer> freq = new HashMap<String, Integer>();
        str2.stream().filter(x -> x != "").forEach(x -> {
            if (freq.containsKey(x)){
                freq.put(x, freq.get(x)+1);
            }
            else
                freq.put(x, 1);
        });
        freq.entrySet().stream().sorted((x, y) -> {
            if (x.getValue() > y.getValue())
                return -1;
            else if (x.getValue() == y.getValue()){
                return x.getKey().compareTo(y.getKey());
            }
            return 1;
        }).map(x -> x.getKey()).limit(10).forEach(x -> System.out.print(x + "\n"));
    }

}
