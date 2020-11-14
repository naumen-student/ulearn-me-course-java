package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;

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
            if (!word.matches("[а-я]{3,}"))
                continue;
            String sortedWord = getSortedWord(word);
            if (!anagrams.containsKey(sortedWord))
                anagrams.put(sortedWord, new TreeSet<>());
            anagrams.get(sortedWord).add(word);
        }

        return (anagrams.values().stream().filter(a -> a.size() > 1)).collect(Collectors.toList());
    }

    private static String getSortedWord(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }
}
