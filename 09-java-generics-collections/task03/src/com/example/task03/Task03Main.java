package com.example.task03;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.*;

public class Task03Main {

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {

        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, TreeSet<String>> anagrams = new TreeMap<>();
        List<Set<String>> result = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            if (word.matches("[А-Яа-я]{3,}")) {
                char[] charsArray = word.toLowerCase().toCharArray();
                Arrays.sort(charsArray);
                String sorted = new String(charsArray);
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
