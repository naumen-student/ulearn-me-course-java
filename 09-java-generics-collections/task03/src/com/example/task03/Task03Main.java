package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class Task03Main {

    public static void main(String[] args) throws IOException {

        List<Set<String>> anagrams = findAnagrams(new FileInputStream
                ("09-java-generics-collections/task03/resources/singular.txt"), Charset.forName("windows-1251"));
        for (Set<String> anagram : anagrams) {
            System.out.println(anagram);
        }

    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, TreeSet<String>> allWords = new HashMap<>();

        while (scanner.hasNextLine()) {
            String current = scanner.nextLine().toLowerCase();
            if (isCorrectWord(current)) {
                char[] arrWord = current.toCharArray();
                Arrays.sort(arrWord);
                String currentKey = new String(arrWord);
                if (!allWords.containsKey(currentKey))
                    allWords.put(currentKey, new TreeSet<String>() {{
                        add(current);
                    }});
                else
                    allWords.get(currentKey).add(current);
            }
        }
        return sortResultList(new ArrayList<>(allWords.values()));
    }

    private static boolean isCorrectWord(String word) {
        if (word.equals("\n") || word.equals("\r") || word.length() < 3)
            return false;
        for (int i = 0; i < word.length(); i++) {
            if (!Character.UnicodeBlock.of(word.charAt(i)).equals(Character.UnicodeBlock.CYRILLIC))
                return false;
        }
        return true;
    }

    private static List<Set<String>> sortResultList(List<Set<String>> unsortedList) {
        List<Set<String>> sortedResult = new ArrayList<>();
        List<String> firstWords = new ArrayList<>();

        for (Set i : unsortedList) {
            firstWords.add((String) i.iterator().next());
        }
        Collections.sort(firstWords);
        for (String word : firstWords) {
            for (Set set : unsortedList) {
                if (word.equals(set.iterator().next()) && set.size() >= 2)
                    sortedResult.add(set);
            }
        }
        return sortedResult;
    }
}
