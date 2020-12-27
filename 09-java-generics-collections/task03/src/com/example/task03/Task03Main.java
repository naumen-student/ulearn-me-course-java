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
        Map<String, TreeSet<String>> allWords = getAllWords(inputStream, charset);
        return sortList(allWords);
    }

    public static Map<String, TreeSet<String>> getAllWords(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, TreeSet<String>> allWords = new TreeMap<>();
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
        return allWords;
    }

    private static List<Set<String>> sortList(Map<String, TreeSet<String>> allSets) {
        List<Set<String>> result = new ArrayList<>();
        for (Set set : allSets.values()) {
            if (set.size() >= 2)
                result.add(set);
        }
        return result;
    }
}
