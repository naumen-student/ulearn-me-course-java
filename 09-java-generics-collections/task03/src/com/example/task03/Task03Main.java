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

        List<Set<String>> list = findAnagrams(new FileInputStream("task03/resources/singular.txt"), Charset.forName("windows-1251"));
        for (Set<String> anagram : list) {
            System.out.println(anagram);
        }

    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset)).useDelimiter("\n");
        Map<String, TreeSet<String>> lists = new TreeMap<>();
        while (scanner.hasNext()) {
            String words = scanner.next().toLowerCase();
            if (words.matches("[а-я]+") && words.length() > 2) {
                char[] arr = words.toCharArray();
                Arrays.sort(arr);
                String sortedWord = new String(arr);
                if (!lists.containsKey(sortedWord)) {
                    lists.put(sortedWord, new TreeSet<>());
                }
                lists.get(sortedWord).add(words);
            }
        }
        return lists
                .values()
                .stream()
                .filter(v -> v.size() > 1)
                .collect(Collectors.toList());
    }
}