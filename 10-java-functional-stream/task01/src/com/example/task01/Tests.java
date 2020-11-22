package com.example.task01;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.example.task01.Task01Main.ternaryOperator;

public class Tests {

    @Test
    public void testNull() {
        Function<String, String> test = ternaryOperator(String::isEmpty, s -> s, String::trim);
        Assertions.assertThat(test).isNotNull();
    }

    @Test
    public void testExample() {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

        Assertions.assertThat(
                Stream.of(
                        "",
                        null,
                        "asdf",
                        "\n\n\n",
                        IntStream.range(1000000, 2000000).mapToObj(i -> "" + i).collect(Collectors.joining())
                ).map(safeStringLength)
        ).containsExactlyElementsOf(
                Stream.of(
                        0, 0, 4, 3, 7000000
                ).collect(Collectors.toList())
        );
    }

    /**
     * Если этот тест падает, значит метод ternaryOperator некорректно обрабатывает значения NULL
     */
    @Test
    public void testNPE() {

        Assertions.assertThatThrownBy(() -> {
            ternaryOperator(null, s -> s, String::trim);
        }).isInstanceOf(NullPointerException.class);

        Assertions.assertThatThrownBy(() -> {
            ternaryOperator(String::isEmpty, null, String::trim);
        }).isInstanceOf(NullPointerException.class);

        Assertions.assertThatThrownBy(() -> {
            ternaryOperator(String::isEmpty, s -> s, null);
        }).isInstanceOf(NullPointerException.class);

    }

}
