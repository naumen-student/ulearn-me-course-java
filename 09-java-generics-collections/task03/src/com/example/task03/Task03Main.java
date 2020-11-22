package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.*;
import java.io.InputStreamReader;

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
        List<Set<String>> result = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            if (word.matches("[А-Яа-я]{3,}")) {
                char[] chars = word.toLowerCase().toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                if (!anagrams.containsKey(sorted))
                    anagrams.put(sorted, new TreeSet<>());
                anagrams.get(sorted).add(word.toLowerCase());
            }
        }
        for (int i = 0; i < anagrams.values().size(); i++) {
            if (anagrams.get(anagrams.keySet().toArray()[i]).size() > 1)
                result.add(anagrams.get(anagrams.keySet().toArray()[i]));
        }
        return result;
    }
}
