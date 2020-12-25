package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class Task03Main {

    public static void main(String[] args) throws IOException {

    }

    private static Set readWords(InputStream inputStream, Charset charset) {
        Set words = new TreeSet<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset));
        String word;
        try {
            while ((word = bufferedReader.readLine()) != null) {
                if (word.length() > 2) {
                    words.add(word.toLowerCase());
                }
            }
        } catch (Exception e) {
        }
        return words;
    }

    private static Map<String, Map<Character, Integer>> getCharsCount(Set<String> words) {
        Map charsInWords = new HashMap<>();
        for (String word : words) {
            Map<Character, Integer> charsInWord = new HashMap<>();
            boolean allCharsIsCyrillic = true;
            for (char character : word.toCharArray()) {
                if (character >= 'а' && character <= 'я') {
                    if (charsInWord.containsKey(character)) {
                        charsInWord.put(character, charsInWord.get(character) + 1);
                    } else {
                        charsInWord.put(character, 1);
                    }
                } else {
                    allCharsIsCyrillic = false;
                    break;
                }
            }
            if (allCharsIsCyrillic) {
                charsInWords.put(word, charsInWord);
            }
        }
        return charsInWords;
    }

    private static List findAnagramsByCharsInWords(Set<String> words) {
        Map<String, Map<Character, Integer>> charsInWords = getCharsCount(words);
        List allAnagrams = new ArrayList<>();
        for (String word : words) {
            if (word == null || word.length() == 0) {
                continue;
            }
            boolean needToAddFirstWord = true;
            Set anagrams = new TreeSet<>();
            Map charsInWord = charsInWords.remove(word);
            for (Map.Entry<String, Map<Character, Integer>> entry : charsInWords.entrySet()) {
                if (entry.getValue() == null) {
                    continue;
                }
                if (entry.getKey().length() != word.length()) {
                    continue;
                }
                if (entry.getValue().size() != charsInWord.size()) {
                    continue;
                }
                boolean wordsIsAnagrams = true;
                for (Map.Entry<Character, Integer> entry1 : entry.getValue().entrySet()) {
                    if (entry1.getValue() != charsInWord.get(entry1.getKey())) {
                        wordsIsAnagrams = false;
                        break;
                    }
                }
                if (wordsIsAnagrams) {
                    if (needToAddFirstWord) {
                        anagrams.add(word);
                        needToAddFirstWord = false;
                    }
                    anagrams.add(entry.getKey());
                    entry.setValue(null);
                }
            }
            if (anagrams.size() > 0) {
                allAnagrams.add(anagrams);
            }
        }
        return allAnagrams;
    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        return findAnagramsByCharsInWords(readWords(inputStream, charset));
    }
}
