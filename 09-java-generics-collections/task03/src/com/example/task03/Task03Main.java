package com.example.task03;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;

public class Task03Main {
    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        TreeMap<String, TreeSet<String>> anagram = new TreeMap<String, TreeSet<String>>();
        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNext()) {
                String nextLine = scanner.nextLine().toLowerCase();
                if (!nextLine.matches("[а-я]{3,}"))
                    continue;
                char[] chars = nextLine.toCharArray();
                Arrays.sort(chars);
                String sortedWord = String.valueOf(chars);
                TreeSet<String> set = new TreeSet<String>();
                set.add(nextLine);
                if (!anagram.containsKey(sortedWord))
                    anagram.put(sortedWord, set);
                else anagram.get(sortedWord).add(nextLine);
            }
        }
        return anagram.values().stream().filter(a -> a.size() > 1).collect(Collectors.toList());
    }
}
