package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import java.util.*;

public class Task03Main {

    public static void main(String[] args) throws IOException {
    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        return null;

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