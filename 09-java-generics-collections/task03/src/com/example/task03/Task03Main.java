package com.example.task03;

import java.nio.charset.Charset;
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
        Map<String, TreeSet<String>> anagrams = new TreeMap<>();
        while (scanner.hasNextLine()) {
            String word = scanner.next().toLowerCase();
            if (word.matches("[а-я]{3,}")) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);
                if (!anagrams.containsKey(sortedWord))
                    anagrams.put(sortedWord, new TreeSet<>());
                anagrams.get(sortedWord).add(word);
            }
        }
        List<Set<String>> result = new ArrayList<>();
        for (Set<String> set : anagrams.values()) {
            if (set.size() > 1)
                result.add(set);
        }
        return result;
    }
}
