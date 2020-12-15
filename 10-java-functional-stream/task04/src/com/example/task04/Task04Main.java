package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Task04Main {

    public static void main(String[] args) {

        // your implementation here

        InputStream input = System.in;
        TreeMap<String, Integer> result = new TreeMap<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
            br.lines().map(x -> x.split("[,.\\-! ]"))
                    .flatMap(x -> Arrays.stream(x.clone()))
                    .filter(x -> x.compareTo("") != 0 && x.compareTo(" ") != 0).map(x -> x.toLowerCase()).forEach(x -> {
                if (result.containsKey(x))
                    result.put(x, result.get(x) + 1);
                else result.put(x, 1);
            });
            result.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                    .map(x -> x.getKey()).limit(10)
                    .forEach(x -> System.out.print(x + "\n"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}