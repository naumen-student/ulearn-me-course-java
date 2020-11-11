package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

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
                if (!anagrams.containsKey(sortedWord))
                    anagrams.put(sortedWord, new TreeSet<String>() {{
                        add(word);
                    }});
                else
                        anagrams.get(sortedWord).add(word);
                }
            }
        return sortResultList(anagrams);
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
