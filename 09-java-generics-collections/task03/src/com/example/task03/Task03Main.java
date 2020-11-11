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
        for (Set<String> anagram : anagrams) { System.out.println(anagram); }

    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset)).useDelimiter("\n");
        Map<String, TreeSet<String>> anagrams = new TreeMap<>();
        while (scanner.hasNext()) {
            String str = scanner.next().toLowerCase();
            if (str.matches("[а-я]+") && str.length() >= 3) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String key = Arrays.toString(chars);
                if (!anagrams.containsKey(key))
                    anagrams.put(key, new TreeSet<String>() {{ add(str); }});
                else
                    anagrams.get(key)
                            .add(str);
            }
        }
        return getSortedAnagrams(anagrams);
    }

    private static List<Set<String>> getSortedAnagrams(Map<String, TreeSet<String>> anagrams) {
        List<Set<String>> result = new ArrayList<>();
        for (Set set : anagrams.values()) {
            if (set.size() >1)
                result.add(set);
        }
        return result;
    }
}
