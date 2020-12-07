package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class Task03Main {

    public static void main(String[] args) throws IOException {

        List<Set<String>> anagrams = findAnagrams(new FileInputStream("task03/resources/singular.txt"), Charset.forName("windows-1251"));
        System.out.println(anagrams);

    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        ArrayList<Set<String>> list = new ArrayList<Set<String>>();
        Scanner scanner = new Scanner(inputStream);
        TreeMap<String, TreeSet<String>> strings= new TreeMap<String, TreeSet<String>>();
        while (scanner.hasNext()){
            String word = scanner.nextLine().toLowerCase();
            if (word.matches("[а-я]+") && word.length() > 3){
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortStr = new String(chars);
                if (!strings.containsKey(sortStr)){
                    strings.put(sortStr, new TreeSet<String>(){{
                        add(word);
                    }
                    });
                }
                else strings.get(sortStr).add(word);
            }
        }
        for(TreeSet<String> combos : strings.values()){
            if (combos.size() > 1){
                list.add(combos);
            }
        }
        return list;
    }
}
