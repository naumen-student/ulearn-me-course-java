package com.example.task03;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
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

        TreeMap<String, TreeSet<String>> anagrams = new TreeMap<>();
        Scanner scanner = new Scanner(inputStream, charset.name());
        while (scanner.hasNext()) {
            String line = scanner.nextLine().toLowerCase();
            if (line.matches("[а-я]{3,}")) {
                char[] lineSymbols = line.toCharArray();
                Arrays.sort(lineSymbols);
                String sorted = new String(lineSymbols);
                if (!anagrams.containsKey(sorted)) {
                    anagrams.put(sorted, new TreeSet<>());
                }
                anagrams.get(sorted).add(line);
            }
        }
        return anagrams.values().stream()
                .filter(value -> value.size() > 1)
                .collect(Collectors.toList());
    }
}
