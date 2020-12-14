package com.example.task03;

import java.nio.charset.Charset;
import java.io.*;
import java.util.*;
import java.util.Arrays;
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
        try(Scanner scan = new Scanner(inputStream, charset.name())){
            scan.useDelimiter("\n");
            while(scan.hasNext()){
                String nextWord = scan.nextLine().toLowerCase();
                if (nextWord.matches("[а-я]+") && nextWord.length() > 2){
                    char[] word = nextWord.toCharArray();
                    Arrays.sort(word);
                    String sorted = new String(word);
                    if (!anagrams.containsKey(sorted)) {
                        anagrams.put(sorted, new TreeSet<>());
                    }
                    anagrams.get(sorted).add(nextWord);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return anagrams.values().stream()
                .filter(value -> value.size() > 1)
                .collect(Collectors.toList());
    }
}
