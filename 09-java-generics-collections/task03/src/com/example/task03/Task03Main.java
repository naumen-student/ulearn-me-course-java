package com.example.task03;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;

public class Task03Main {

    public static void main(String[] args) throws IOException {

        List<Set<String>> anagrams = findAnagrams(new FileInputStream("09-java-generics-collections/task03/resources/singular.txt"), Charset.forName("windows-1251"));
        for (Set<String> anagram : anagrams) {
            System.out.println(anagram);
        }

    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Map<String, TreeSet<String>> map = new TreeMap<>();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        while (scanner.hasNextLine()) {
            String word = scanner.next();
            if (word.matches("[А-Яа-я]{3,}")) {
                char[] arrayWord = word.toLowerCase().toCharArray();
                Arrays.sort(arrayWord);
                String arrSort = new String(arrayWord);
                if (!map.containsKey(arrSort))
                    map.put(arrSort, new TreeSet<>());
                map.get(arrSort).add(word.toLowerCase());
            }
        }
        List<Set<String>> res = new ArrayList<>();
        for (int i = 0; i < map.values().size(); i++) {
            TreeSet key = map.get(map.keySet().toArray()[i]);
            if (key.size() > 1)
                res.add(key);
        }
        return res;
    }
}
