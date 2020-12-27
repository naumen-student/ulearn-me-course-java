package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.*;

public class Task03Main {

    public static void main(String[] args) throws IOException {
    }

    private static List<Set<String>> sortResult(TreeMap<String, TreeSet<String>> sets) {
        List<Set<String>> result = new ArrayList<>();
        for (Set set : sets.values()) {
            if (set.size() >= 2)
                result.add(set);
        }
        return result;
    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        TreeMap<String, TreeSet<String>> anagrams = new TreeMap<>();
        while (scanner.hasNextLine()) {
            String current = scanner.nextLine().toLowerCase();
            if (current.length() > 2 && current.matches("[а-я]+")) {
                char[] chars = current.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                if (!anagrams.containsKey(key))
                    anagrams.put(key, new TreeSet<>());
                anagrams.get(key).add(current);
            }
        }
        return sortResult(anagrams);
    }
}