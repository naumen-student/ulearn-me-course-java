package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Task04Main {

    public static void main(String[] args) {

        InputStream input = System.in;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
            br.lines().map(x -> x.split("[,.\\-! ]"))
                    .flatMap(x -> Arrays.stream(x.clone()))
                    .filter(x -> x.compareTo("") != 0 && x.compareTo(" ") != 0).map(x -> x.toLowerCase())
                    .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(10)
                    .forEach(x -> System.out.print(x.getKey() + "\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

