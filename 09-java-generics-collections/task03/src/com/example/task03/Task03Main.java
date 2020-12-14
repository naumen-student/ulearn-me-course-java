package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.*;

public class Task03Main {

    public static void main(String[] args) throws IOException { }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, TreeSet<String>> words = new TreeMap<>();
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine().toLowerCase();
            if (str.length() <= 2 || !str.matches("[а-я]+")) continue;
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if (words.containsKey(key)) words.get(key).add(str);
            else words.put(key, new TreeSet<String>() {{ add(str); }});
        }
        return getSortedList(words);


    }

    private static List<Set<String>> getSortedList(Map<String, TreeSet<String>> words) {
        List<Set<String>> res = new ArrayList<>();
        for (Set set: words.values())
            if(set.size() >= 2) res.add(set);
        return res;
    }
}
