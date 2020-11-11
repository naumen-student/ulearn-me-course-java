package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;

class WordCharacters{
    private final String word;
    private final HashSet<Character> characters;

    WordCharacters(String word){
        this.word = word.toLowerCase();
        characters = new HashSet<>();
        for (Character c : this.word.toCharArray()) {
            characters.add(c);
        }
    }

    public boolean EqualString(WordCharacters wordCharacters){
        return wordCharacters.word.equals(word);
    }

    @Override
    public boolean equals(Object o){
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        WordCharacters that = (WordCharacters) o;
        return characters.equals(that.characters);
    }

    @Override
    public int hashCode(){
        return characters.hashCode();
    }

    public String getWord(){
        return word;
    }
}

public class Task03Main{

    public static void main(String[] args) throws IOException{

        List<Set<String>> anagrams = findAnagrams(new FileInputStream("task03/resources/singular.txt"), Charset.forName("windows-1251"));
        anagrams
                .forEach(System.out::println);

    }

    private static final Comparator<Set<String>> comparator =
            Comparator.comparing(o -> o.stream().findFirst().orElse(""));

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset){
        List<List<WordCharacters>> result = new ArrayList<>();
        try (Scanner scanner = new Scanner(inputStream, charset)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if ( isValidWord(line) )
                    addCharactersToResult(result, new WordCharacters(line));
            }
        }

        return result.stream()
                .map(x -> x.stream()
                        .map(WordCharacters::getWord)
                        .collect(Collectors.toCollection(TreeSet::new)))
                .filter(x -> x.size() > 1)
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    private static boolean isValidWord(String line){
        return line.length() > 3
                && line.chars()
                .allMatch(x -> Character.UnicodeBlock.of(x) == Character.UnicodeBlock.CYRILLIC);
    }

    private static void addCharactersToResult(List<List<WordCharacters>> lists, WordCharacters wordCharacters){
        List<WordCharacters> group = null;
        for (List<WordCharacters> list : lists) {
            if ( list.stream().anyMatch(x -> x.equals(wordCharacters) && !x.EqualString(wordCharacters)) ) {
                group = list;
                break;
            }
        }

        if ( group == null ) {
            List<WordCharacters> list = new ArrayList<>();
            list.add(wordCharacters);
            lists.add(list);
        } else
            group.add(wordCharacters);
    }
}
