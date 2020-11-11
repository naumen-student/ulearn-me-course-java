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

        List<Set<String>> anagramsList = new ArrayList<>();
        Set<String> allWords = getAllWords(inputStream, charset);
        Set<String> usedWords = new TreeSet<>(allWords);

        for (String word : allWords) {
            if (usedWords.contains(word)) {
                Set<String> wordSet = getSetForWord(allWords, word);
                usedWords.removeAll(wordSet);
                if (wordSet.size() >= 2)
                    anagramsList.add(wordSet);
            }
        }
        return anagramsList;
    }

    public static Set<String> getAllWords(InputStream inputStream, Charset charset) {
        Set<String> allWords = new TreeSet<>();
        Scanner scanner = new Scanner(inputStream, charset.name());
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine().toLowerCase();
            if (word.length() >= 3 && word.matches("[а-я]+"))
                allWords.add(word);
        }
        return allWords;
    }

    public static Set<String> getSetForWord(Set<String> allWords, String word) {
        Set<String> wordSet = new TreeSet<>();
        for (String otherWord : allWords) {
            char[] ch1 = word.toCharArray();
            char[] ch2 = otherWord.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2))
                wordSet.add(otherWord);
        }
        return wordSet;    }
}
