package com.example.task04;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task04Main{
    private static final Pattern pattern = Pattern.compile("\\W+", Pattern.UNICODE_CHARACTER_CLASS);

    public static void main(String[] args){
        InputStream in = System.in;
        Map<String, Integer> frequency = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            FillFrequencyMap(reader.lines(), frequency);
        } catch (IOException ignored) {
        }

        frequency.entrySet()
                .stream()
                .sorted((o1, o2) -> {
                    if ( o1.getValue().compareTo(o2.getValue()) == 0 )
                        return o1.getKey().compareTo(o2.getKey());
                    return o2.getValue().compareTo(o1.getValue());
                })
                .map(Map.Entry::getKey)
                .filter(x -> !x.equals(""))
                .limit(10)
                .forEach(x -> System.out.printf("%s\n", x));

    }

    private static void FillFrequencyMap(Stream<String> lines, Map<String, Integer> map){
        lines.forEach((x) -> {
            String[] words = pattern.split(x.toLowerCase());
            for (String word : words) {
                if ( !map.containsKey(word) )
                    map.put(word, 0);
                map.put(word, map.get(word) + 1);
            }
        });
    }
}
