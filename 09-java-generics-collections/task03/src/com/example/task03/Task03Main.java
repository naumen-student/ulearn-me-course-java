package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;

public class Task03Main
{

    public static void main(String[] args) throws IOException
    {
        List<Set<String>> anagrams = findAnagrams(new FileInputStream("09-java-generics-collections/task03/resources/singular.txt"), Charset.forName("windows-1251"));
        for (Set<String> anagram : anagrams)
        {
            System.out.println(anagram);
        }

    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset)
    {
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));
        Map<String, TreeSet<String>> words = new TreeMap<>();

        while (scanner.hasNextLine())
        {
            String currentWord = scanner.nextLine().toLowerCase();
            if (currentWord.matches("[а-я]+") && currentWord.length() > 2)
            {
                char[] arrWord = currentWord.toCharArray();
                Arrays.sort(arrWord);
                String currentKey = new String(arrWord);
                if (!words.containsKey(currentKey))
                {
                    words.put(currentKey, new TreeSet<String>() {{
                        add(currentWord);
                    }});
                }
                else
                {
                    words.get(currentKey).add(currentWord);
                }
            }
        }
        return words.values().stream().filter((it) -> it.size() >= 2).collect(Collectors.toList());
    }
}