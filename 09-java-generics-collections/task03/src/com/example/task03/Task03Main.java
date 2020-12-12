package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

        TreeMap<String, TreeSet<String>> anagrams = new TreeMap<String, TreeSet<String>>();
        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine().toLowerCase();
                if (!line.matches("[а-я]{3,}"))
                    continue;
                char[] chars = line.toCharArray();
                Arrays.sort(chars);
                String sortedWord = String.valueOf(chars);
                TreeSet<String> set = new TreeSet<String>();
                set.add(line);
                if (!anagrams.containsKey(sortedWord))
                    anagrams.put(sortedWord, set);
                else anagrams.get(sortedWord).add(line);
            }
        }
        return anagrams.values().stream().filter(a -> a.size() > 1).collect(Collectors.toList());
    }
}
