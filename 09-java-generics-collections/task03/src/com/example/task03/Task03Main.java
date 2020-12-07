package com.example.task03;

import java.io.*;
import java.util.*;
import java.nio.charset.*;

public class Task03Main {

    public static void main(String[] args) throws IOException {

        List<Set<String>> currentAnagrams = findAnagrams(
                new FileInputStream("09-java-generics-collections/task03/resources/singular.txt"),
                Charset.forName("windows-1251"));
        for (Set<String> anagram : currentAnagrams) {
            System.out.println(anagram);
        }
    }

    private static List<Set<String>> sortedList(Map<String, TreeSet<String>> sets) {
        List<Set<String>> filterSet = new ArrayList<>();
        for (Set set : sets.values()) {
            if (set.size() >= 2)
                filterSet.add(set);
        }
        return filterSet;
    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scan = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, TreeSet<String>> words = new TreeMap<>();
        while (scan.hasNextLine()) {
            String curr = scan.nextLine().toLowerCase();
            if (curr.length() > 2 && curr.matches("[а-я]+")) {
                char[] wordsFromArray = curr.toCharArray();
                Arrays.sort(wordsFromArray);
                String key = new String(wordsFromArray);
                if (!words.containsKey(key))
                    words.put(key, new TreeSet<String>() {{
                        add(curr);
                    }});
                else words.get(key).add(curr);
            }
        }
        return sortedList(words);
    }
}
