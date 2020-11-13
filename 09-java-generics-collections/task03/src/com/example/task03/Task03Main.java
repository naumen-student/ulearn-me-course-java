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

        List<String> words = new ArrayList<>();

        try {
            String word;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset));
            while ((word = bufferedReader.readLine()) != null) {
                if (!words.contains(word) && formatIsOk(word))
                    words.add(word.toLowerCase());
            }
        } catch (IOException ignored) {
        }

        Map<String, TreeSet<String>> anagramsMap = new HashMap<>();
        for (String word : words) {
            String key = getHashSetKey(anagramsMap.keySet(), word);
            if (key == null) {
                TreeSet<String> set = new TreeSet<>();
                set.add(word);
                anagramsMap.put(word, set);
            } else {
                anagramsMap.get(key).add(word);
            }
        }

        List<Set<String>> anagrams = new ArrayList<>();
        for (String key : anagramsMap.keySet()) {
            if (anagramsMap.get(key).size() > 1) {
                anagrams.add(anagramsMap.get(key));
            }
        }

        return anagrams;
    }

    private static boolean formatIsOk(String word) {

        return (word.length() > 2) && word.matches("[А-я]+");
    }

    private static String getHashSetKey(Set<String> keySet, String word) {
        for (String key : keySet) {
            if (areAnagrams(key, word)) {
                return key;
            }
        }
        return null;
    }

    private static boolean areAnagrams(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }
        char[] sourceChars = word1.toCharArray();
        char[] resourceChars = word2.toCharArray();
        Arrays.sort(sourceChars);
        Arrays.sort(resourceChars);
        return Arrays.equals(sourceChars, resourceChars);
    }
}
