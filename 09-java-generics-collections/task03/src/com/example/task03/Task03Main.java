package com.example.task03;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.*;

public class Task03Main {

    public static void main(String[] args) {
    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, SortedSet<String>> map = new TreeMap<>();
        while (scanner.hasNextLine()){
            String word = scanner.nextLine().toLowerCase();
            if(!checkLenghtLanguage(word))
                continue;
            String sortedChar = getSortString(word);
            if (!map.containsKey(sortedChar))
                map.put(sortedChar, new TreeSet<>());
            map.get(sortedChar).add(word);
        }
        return getListAnagram(map);
    }

    private static boolean checkLenghtLanguage(String word){
        return word.matches("[а-яА-Я]{3,}");
    }

    private static String getSortString(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private static List<Set<String>> getListAnagram(Map<String, SortedSet<String>> map){
        List<Set<String>> result = new ArrayList<>();
        for (Set setWord : map.values())
            if (setWord.size() > 1)
                result.add(setWord);
        return result;
    }
}
