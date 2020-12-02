package com.example.task03;

import com.sun.jmx.remote.internal.ArrayQueue;
import org.assertj.core.util.Sets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task03Main {

    public static void main(String[] args) throws IOException {

        List<Set<String>> anagrams = findAnagrams(new FileInputStream("task03/resources/singular.txt"), Charset.forName("windows-1251"));
        for (Set<String> anagram : anagrams) {
            System.out.println(anagram);
        }

    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Set<String> dictionary = new HashSet<>();
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().toLowerCase();
            Pattern p = Pattern.compile("[а-яёЁ]+");
            if (s.length() < 3 || !p.matcher(s).matches()) {
                continue;
            }
            dictionary.add(s);
        }

        List<String> list = new ArrayList<>(dictionary).stream().sorted().collect(Collectors.toList());
        List<Set<String>> result = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (indexes.contains(i)) {
                continue;
            }

            List<String> group = new ArrayList<>();
            group.add(list.get(i));

            Set<String> first_word = new HashSet<>(Arrays.asList(list.get(i).split("")));

            for (int j = i + 1; j < list.size(); j++) {

                Set<String> second_word = new HashSet<>(Arrays.asList(list.get(j).split("")));

                if (first_word.equals(second_word)) {
                    group.add(list.get(j));
                    indexes.add(j);
                }
            }

            if (group.size() >= 2) {
                Set<String> set = group.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
                result.add(set);
            }
        }

        return result;
    }
}
