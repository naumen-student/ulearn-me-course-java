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
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        Scanner scanner = new Scanner(inputStreamReader);
        Map<String, TreeSet<String>> anagrams = new TreeMap<>();
        List<Set<String>> res = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String word = scanner.next();
            if (word.matches("[А-Яа-я]{3,}")) {
                char[] chars = word.toLowerCase().toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                if (!anagrams.containsKey(sorted))
                    anagrams.put(sorted, new TreeSet<>());
                anagrams.get(sorted).add(word.toLowerCase());
            }
        }
        for (int i = 0; i < anagrams.values().size(); i++) {
            TreeSet keyToAnagrams = anagrams.get(anagrams.keySet().toArray()[i]);
            if (keyToAnagrams.size() > 1)
                res.add(keyToAnagrams);
        }
        return res;
    }
}
