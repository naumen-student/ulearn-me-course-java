package com.example.task03;

import com.github.javaparser.metamodel.StringLiteralExprMetaModel;
import org.assertj.core.util.Streams;

import java.beans.Encoder;
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;

public class Task03Main {

    public static void main(String[] args) throws IOException {

        List<Set<String>> anagrams = findAnagrams(
                new FileInputStream("C:\\Users\\DS\\IdeaProjects\\ulearn-me-course-java\\09-java-generics-collections\\task03\\resources\\singular.txt"),
                Charset.forName("windows-1251"));
        for (Set<String> anagram : anagrams) {
            System.out.println(anagram);
        }
    }

    public static String getSortedWord(String word){
        char[] str = word.toCharArray();
        Arrays.sort(str);
        return new String(str);
    }

    public static boolean isCorrectWord(String word){
        for(char sym: word.toCharArray())
            if("абвгдеёжзийклмнопрстуфхцчшщъыьэюя".indexOf(sym) < 0)
                return false;
        return word.length() >= 3;
    }

    public static List<Set<String>> getPairAnagrams(List<String> words, List<String> sorted){
        List<Set<String>> anagrams = new ArrayList<>();
        for(String word: sorted){
            if (word == "")
                continue;
            int deleteIndex = sorted.indexOf(word);
            Set<String> set = new TreeSet<>();
            while (deleteIndex >= 0){
                set.add(words.get(deleteIndex));
                sorted.set(deleteIndex, "");
                deleteIndex = sorted.indexOf(word);
            }
            if (set.size() > 1)
                anagrams.add(set);
        }
        return anagrams;
    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) throws IOException {
        Scanner scanner = new Scanner(inputStream, charset);
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()){
            String line = scanner.nextLine().toLowerCase();
            if (!words.contains(line) && isCorrectWord(line))
                words.add(line);
        }
        List<String> sortedWords = words.stream().map(x -> getSortedWord(x)).collect(Collectors.toList());
        Comparator<Set<String>> comparator = Comparator.comparing(x -> x.stream().findFirst().get());
        return getPairAnagrams(words, sortedWords).stream().sorted(comparator).collect(Collectors.toList());
    }
}

