package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import java.io.*;
import java.util.*;

public class Task03Main {

    public static void main(String[] args) throws IOException {

        List<Set<String>> anagrams = findAnagrams(new FileInputStream("task03/resources/singular.txt"), Charset.forName("windows-1251"));
        for (Set<String> anagram : anagrams) {
            System.out.println(anagram);
        }

    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, TreeSet<String>> allWords = new TreeMap<>();
        while (scanner.hasNext()) {
            String current = scanner.next().toLowerCase();
            if (current.matches("[а-я]+") && current.length() > 2) {
                char[] word = current.toCharArray();
                Arrays.sort(word);
                String key = new String(word);
                if (!allWords.containsKey(key))
                    allWords.put(key, new TreeSet<String>() {{
                        add(current); }});
                else
                    allWords.get(key).add(current);
            }
        }
        return sortResultList(allWords);
    }

    private static List<Set<String>> sortResultList(Map<String, TreeSet<String>> allSets) {
        List<Set<String>> setsFilter = new ArrayList<>();
        for (Set set : allSets.values()) {
            if (set.size() >= 2)
                setsFilter.add(set);
        }
        return setsFilter;
    }
}
