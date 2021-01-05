package com.example.task03;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tests {

    class MinMaxConsumer<T> implements BiConsumer<T, T> {

        T min, max;
        int calls = 0;

        @Override
        public void accept(T min, T max) {
            calls++;
            this.min = min;
            this.max = max;
        }
    }

    public <T> void check(T[] input, Comparator<T> comparator, T expectMin, T expectMax) {
        MinMaxConsumer<T> consumer = new MinMaxConsumer<>();
        Task03Main.findMinMax(Stream.of(input), comparator, consumer);
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(consumer.calls).as("BiConsumer calls").isEqualTo(1);
        sa.assertThat(consumer.min).as("min for input: " + Arrays.toString(input)).isEqualTo(expectMin);
        sa.assertThat(consumer.max).as("max for input: " + Arrays.toString(input)).isEqualTo(expectMax);
        sa.assertAll();
    }

    @Test
    public void testNPE() {
        Assertions.assertThatThrownBy(() ->
                check(null, Integer::compare, 1, 9)
        ).isInstanceOf(NullPointerException.class);

        Assertions.assertThatThrownBy(() ->
                check(new Integer[]{2, 9, 5, 4, 8, 1, 3}, null, 1, 9)
        ).isInstanceOf(NullPointerException.class);
    }

    @Test
    public void testExample() {
        check(new Integer[]{2, 9, 5, 4, 8, 1, 3}, Integer::compare, 1, 9);
    }

    @Test
    public void testEmpty() {
        check(new Integer[]{}, Integer::compare, null, null);
    }

    @Test
    public void testString() {
        check(new String[]{"q", "w", "e", "r", "t", "y"}, String::compareTo, "e", "y");
    }

    /**
     * В этом тесте поток выдает довольно много информации.
     * Попытайтесь не размещать все данные в памяти.
     */
    @Test
    public void testBig() {
        MinMaxConsumer<Long> consumer = new MinMaxConsumer<>();
        Task03Main.findMinMax(IntStream.range(7, 200000008).mapToObj(Long::valueOf), Long::compare, consumer);
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(consumer.calls).as("BiConsumer calls").isEqualTo(1);
        sa.assertThat(consumer.min).as("min for input: 7..200000007").isEqualTo(7);
        sa.assertThat(consumer.max).as("max for input: 7..200000007").isEqualTo(200000007);
        sa.assertAll();
    }

    @Test
    public void testNull() {
        check(new Object[]{null, 0L}, (a, b) -> {
            if (b == null) return 1;
            else if (a == null) return -1;
            else return 0;
        }, null, 0L);
    }
}
