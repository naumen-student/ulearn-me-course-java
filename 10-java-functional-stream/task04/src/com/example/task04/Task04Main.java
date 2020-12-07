package com.example.task04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Task04Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(Pattern.compile("[\\-,\\.:;'\"_!? \n]"))
                .tokens()
                .map(String::toLowerCase)
                .filter(x -> !x.equals(""))
                .forEach(word -> {
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                });

        map.entrySet().stream()
                .sorted(
                        (word1, word2) -> {
                            if (word1.getValue().equals(word2.getValue())) {
                                return CharSequence.compare(word1.getKey(), word2.getKey());
                            }
                            else {
                                return Integer.compare(word2.getValue(), word1.getValue());
                            }
                        })
                .limit(10)
                .forEachOrdered(word -> System.out.print(word.getKey() + "\n"));
    }

}
