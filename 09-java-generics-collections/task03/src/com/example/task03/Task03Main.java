package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
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
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, TreeSet<String>> anagrams = new TreeMap<>();

        while (scanner.hasNextLine()) {
            String current = scanner.nextLine().toLowerCase();
            if (current.matches("[а-я]+") && current.length() >= 3) {
                char[] chars = current.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);

                if (!anagrams.containsKey(sorted))
                    anagrams.put(sorted, new TreeSet<>());
                anagrams.get(sorted).add(current);
            }
        }

        List<Set<String>> result = new ArrayList<>();
        for (Set set : anagrams.values()) {
            if (set.size() >= 2)
                result.add(set);
        }
        return result;
    }
}
