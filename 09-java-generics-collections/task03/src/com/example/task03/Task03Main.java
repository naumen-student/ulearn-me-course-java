package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class Task03Main {

    public static void main(String[] args) throws IOException {

        List<Set<String>> anagrams = findAnagrams(new FileInputStream("D:\\Jaba\\ulearn-me-course-java\\09-java-generics-collections\\task03\\resources\\singular.txt"), Charset.forName("windows-1251"));
        for (Set<String> anagram : anagrams)
            System.out.println(anagram);
    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, TreeSet<String>> anagrams = new TreeMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();
            if (!word.matches("[а-я]") && word.length() <= 2)
                break;
            String wordKey = getWordKey(word);
            if (anagrams.containsKey(wordKey))
                anagrams.get(wordKey).add(word);
            else {
                TreeSet<String> arr = new TreeSet<>();
                arr.add(word);
                anagrams.put(wordKey, arr);
            }
        }
        return sortAnagrams(anagrams);
    }

    private static String getWordKey(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private static List<Set<String>> sortAnagrams(Map<String, TreeSet<String>> anagrams) {
        List<Set<String>> result = new ArrayList<>();
        for (Set sets : anagrams.values())
            if (sets.size() >= 2)
                result.add(sets);
        return result;
    }
}