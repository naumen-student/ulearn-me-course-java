package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        SortedMap<String, SortedSet<String>> allWords = new TreeMap<>();
        while (scanner.hasNextLine()) {
            String current = scanner.nextLine().toLowerCase();
            if (current.matches("[а-я]+") && current.length() > 2) {
                char[] arrWord = current.toCharArray();
                Arrays.sort(arrWord);
                String currentKey = new String(arrWord);
                if (!allWords.containsKey(currentKey))
                    allWords.put(currentKey, new TreeSet<String>() {{
                        add(current);
                    }});
                else
                    allWords.get(currentKey).add(current);
            }
        }
        List<Set<String>> anagrams = new ArrayList<>();
        for (Set set : allWords.values()) {
            if (set.size() > 1)
                anagrams.add(set);
        }
        return anagrams;
    }
}