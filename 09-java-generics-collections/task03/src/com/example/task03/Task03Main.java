package com.example.task03;


import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.InputStreamReader;
import java.util.*;

public class Task03Main {

    public static void main(String[] args) throws IOException {

    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, TreeSet<String>> anagrams = new TreeMap<>();
        while (scanner.hasNextLine()) {
            String word = scanner.next().toLowerCase();
            if (word.matches("[а-я]{3,}")) {
                String sortedWord = getSortedWord(word);
                if (!anagrams.containsKey(sortedWord))
                    anagrams.put(sortedWord, new TreeSet<>());
                anagrams.get(sortedWord).add(word);
            }
        }
        return filterAnagrams(anagrams);
    }

    private static String getSortedWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
        }



    private static List<Set<String>> filterAnagrams(Map<String, TreeSet<String>> anagrams) {
        List<Set<String>> result = new ArrayList<>();
        for (Set<String> set : anagrams.values()) {
            if (set.size() > 1)
                result.add(set);
        }
        return result;
    }
}
