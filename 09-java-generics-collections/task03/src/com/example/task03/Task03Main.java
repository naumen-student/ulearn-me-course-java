package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class Task03Main {

    public static void main(String[] args) throws IOException {

        List<Set<String>> anagrams = findAnagrams(new FileInputStream(
                "C:\\Users\\diyll\\IdeaProjects\\ulearn-me-course-java\\09-java-generics-collections\\task03\\build\\resources\\main"),
                Charset.forName("windows-1251"));
        for (Set<String> anagram : anagrams) {
            System.out.println(anagram);
        }

    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, TreeSet<String>> anagrams = new TreeMap<>();

        while (scanner.hasNext()) {
            String current = scanner.next().toLowerCase();

            if (current.matches("[а-я]+") && current.length() > 2) {
                char[] word = current.toCharArray();
                Arrays.sort(word);
                String key = new String(word);

                if (!anagrams.containsKey(key))
                    anagrams.put(key, new TreeSet<String>() {{
                        add(current); }});
                else {
                    anagrams.get(key).add(current);
                }
            }
        }
        return sortAnagrams(anagrams);
    }

    private static List<Set<String>> sortAnagrams(Map<String, TreeSet<String>> anagrams) {
        List<Set<String>> result = new ArrayList<>();
        for (Set set : anagrams.values()) {
            if (set.size() >= 2)
                result.add(set);
        }
        return result;
    }

}
