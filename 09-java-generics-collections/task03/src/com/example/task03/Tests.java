package com.example.task03;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tests {

    private void check(List<String> words, List<List<String>> result) {
        String input = String.join("\n", words);
        Assertions.assertThat("" + Task03Main.findAnagrams(new ByteArrayInputStream(input.getBytes()), Charset.defaultCharset()))
                .as("Input: %s", input)
                .isEqualTo("" + result);
    }

    @Test
    public void testExample() {
        List<String> words = Arrays.asList(
                "трос",
                "накал",
                "рост",
                "чесотка",
                "сорт",
                "отсечка");

        List<List<String>> result = Arrays.asList(
                Arrays.asList("отсечка", "чесотка"),
                Arrays.asList("рост", "сорт", "трос")
        );

        check(words, result);
    }

    @Test
    public void test() {
        List<String> words = Arrays.asList(
                "Корт",
                "Варан",
                "КРОТ",
                "Навар"
        );

        List<List<String>> result = Arrays.asList(
                Arrays.asList("варан", "навар"),
                Arrays.asList("корт", "крот")
        );

        check(words, result);
    }

    @Test
    public void testErrors() {
        List<String> words = Arrays.asList(
                "а",
                "а",
                "б",
                "б",
                "ддд",
                "ддд",
                "ддд",
                "ддд",
                "ва",
                "ав",
                "Адрес",
                "адреС",
                "шляпа-котелок",
                "котелок-шляпа",
                "",
                "",
                "qwerty",
                "ytrewq"
        );

        List<List<String>> result = Collections.emptyList();

        check(words, result);
    }

    @Test
    public void testEmpty() {
        List<String> words = Collections.emptyList();
        List<List<String>> result = Collections.emptyList();
        check(words, result);
    }
}
