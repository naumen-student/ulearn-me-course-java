package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task04Main {

    public static void main(String[] args) {
        Map<String, Integer> res = new HashMap<>();
        new Scanner(System.in)
                .useDelimiter(Pattern.compile("[.,:;'!?_ \n\\-\"]"))
                .tokens()
                .map(String::toLowerCase)
                .filter(x -> !x.equals(""))
                .forEach(x -> res.put(x, res.containsKey(x) ? res.get(x) + 1 : 1));
        res
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEachOrdered(x -> System.out.print(x.getKey() + "\n"));
    }
}
