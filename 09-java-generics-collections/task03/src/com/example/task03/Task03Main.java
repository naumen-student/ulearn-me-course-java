package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

        Set<String> words = readAll(inputStream, charset);
        Set<Set<String>> result = new LinkedHashSet<>();

        for (String word: words) {
            Set<String> currentSet = findAnagramsForWord(word, words);
            if (currentSet.size() >= 2) {
                result.add(currentSet);
            }
        }

        return new ArrayList<>(result);
    }

    private static Set<String> findAnagramsForWord(String word, Set<String> words) {
        Set<String> result = new TreeSet<>();

        for (String currentWord : words) {
            if (isAnagram(word, currentWord)) {
                result.add(currentWord);
            }
        }

        return result;
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] word1 = s1.toCharArray();
        char[] word2 = s2.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

    private static Set<String> readAll(InputStream inputStream, Charset charset) {
        Set<String> result = new TreeSet<>();
        Scanner scanner = new Scanner(inputStream, charset.name());

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine().toLowerCase();
            if (word.length() >= 3 && word.matches("[а-я]+")) {
                result.add(word);
            }
        }

        return result;
    }
}
