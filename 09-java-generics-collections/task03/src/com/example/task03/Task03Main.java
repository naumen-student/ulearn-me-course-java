package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;

public class Task03Main {

    public static void main(String[] args) throws IOException {

        List<Set<String>> anagrams = findAnagrams(new FileInputStream("task03/resources/singular.txt"), Charset.defaultCharset());
        for (Set<String> anagram : anagrams) {
            System.out.println(anagram);
        }
    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        HashMap<String, SortedSet<String>> dict = new HashMap<>();
        new BufferedReader(new InputStreamReader(inputStream, charset))
                .lines()
                .map(String::toLowerCase)
                .filter(it -> it.length() >= 3 && it.matches("[а-я]*"))
                .distinct()
                .forEach(it -> {
                    char[] sorted = it.toCharArray();
                    Arrays.sort(sorted);
                    String key = Arrays.toString(sorted);
                    if(dict.containsKey(key)){
                        dict.get(key).add(it);
                    } else {
                        SortedSet<String> list = new TreeSet<>();
                        list.add(it);
                        dict.put(key, list);
                    }
                });

        return dict.values()
                .stream()
                .filter(it -> it.size() > 1)
                .sorted(Comparator.comparing(SortedSet::first))
                .collect(Collectors.toList());
    }
}