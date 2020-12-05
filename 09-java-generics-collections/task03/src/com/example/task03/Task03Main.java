package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
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
        Scanner sc = new Scanner(inputStream);
        List<String> allWords = getAllWords(sc);

        List<Set<String>> anagrams = new ArrayList<>();
        for(int i = 0; i < allWords.size(); i++) {

            Set<String> words = new HashSet<>();
            words.add(allWords.get(i));

            for (int j = i + 1; j < allWords.size(); j++) {
                if (getStringAsSet(allWords.get(i)).equals(getStringAsSet(allWords.get(j)))) {
                    words.add(allWords.remove(j));
                    j--;
                }
            }

            if (words.size() > 1) {
                anagrams.add(words.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new)));
            }
        }

        return anagrams;
    }

    public static List<String> getAllWords(Scanner scanner) {
        Set<String> set = new HashSet<>();
        while (scanner.hasNextLine()) {
            set.add(scanner.nextLine().toLowerCase(Locale.ROOT));
        }
        return new ArrayList<>(set)
                .stream()
                .filter(s -> s.length() >= 3 && s.matches("[а-яё]+"))
                .sorted()
                .collect(Collectors.toList());
    }

    public static Set<Character> getStringAsSet(String word) {
        HashSet<Character> hs = new HashSet<>();
        word.chars()
                .filter(Character::isAlphabetic)
                .forEach(c -> hs.add((char) c));
        return hs;
    }
}
