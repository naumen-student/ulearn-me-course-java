package com.example.task03;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;

public class Task03Main {

    public static void main(String[] args) {
    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset)
    {
        return
            GetMap(getFilteredWords(inputStream))
            .values()
            .stream()
            .filter(x->x.size()>=2)
            .sorted(Comparator.comparing(TreeSet::first))
            .collect(Collectors.toList());
    }

    private static Map<HashSet<Character>, TreeSet<String>> GetMap(List<String> text)
    {
        HashMap<HashSet<Character>, TreeSet<String>> dict = new HashMap<>();
        for (String str:text)
        {
            HashSet hashSet =  str.chars().mapToObj(x->(char)x).collect(Collectors.toCollection(HashSet::new));
            if (dict.containsKey(hashSet))
                dict.get(hashSet).add(str);
            else
                dict.put(hashSet, new TreeSet<>(Collections.singleton(str)));
        }
        return dict;
    }

    private  static List<String> getFilteredWords(InputStream inputStream)
    {
        ArrayList<String> readied = new ArrayList<>();
        new Scanner(inputStream).forEachRemaining(x-> readied.add(x.toLowerCase()));

        return
            readied
            .stream()
            .filter(x->x.length()>=3 && x.matches("[а-я]+"))
            .distinct()
            .collect(Collectors.toList());
    }
}
