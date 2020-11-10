package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;

public class Task03Main {

    public static void main(String[] args) throws IOException {

        List<Set<String>> anagrams = findAnagrams(new FileInputStream("task03/resources/singular.txt"), Charset.forName("windows-1251"));
        for (Set<String> anagram : anagrams) {
            System.out.println(anagram);
        }

    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset)).useDelimiter("\n");
        Map<String, TreeSet<String>> anagrams = new TreeMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();
            if (word.matches("[а-я]+") && word.length() > 2) {
                char[] arr = word.toCharArray();
                Arrays.sort(arr);
                String sortedWord = new String(arr);
                if (!anagrams.containsKey(sortedWord)) {
                    anagrams.put(sortedWord, new TreeSet<>());
                }
                anagrams.get(sortedWord).add(word);
            }
        }
        return anagrams
                .values()
                .stream()
                .filter(v -> v.size() > 1)
                .collect(Collectors.toList());
    }
}