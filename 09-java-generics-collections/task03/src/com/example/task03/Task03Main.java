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
            String word = scanner.nextLine().toLowerCase(); //приводим слова к нижнему регистру
            if (word.matches("[а-я]+") && word.length() > 3){ // проверяем длину слова и соответствие русскому алфавиту
                char[] chars = word.toCharArray(); // создаем массив символов
                Arrays.sort(chars); //сортируем все символы
                String sortStr = new String(chars); // собираем обратно в строку                   // все анаграммы состоят из одинаковых букв
                if (!strings.containsKey(sortStr)){ // смотрим есть ли в нашем словаре такое слово //и при сортировке мы получим одинаковые значения
                    strings.put(sortStr, new TreeSet<String>(){{ //кладем наше сортированное слово и само слово в словарь
                        add(word);
                    }
                    });
                }
                else strings.get(sortStr).add(word); // если его нет в словаре, добавляем новый
            }
        }
        for(TreeSet<String> combos : strings.values()){
            if (combos.size() > 1){ // если более одной анаграммы добавляем в итоговый лист
                list.add(combos);
            }
        }
        return list;
    }
}
