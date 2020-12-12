package com.example.task01;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;

public class TestsImpl implements ITests {

    @Test
    public void testNonEmpty() {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst();
        String s = pair.getSecond();

        Assertions.assertThat(i).isEqualTo(1);
        Assertions.assertThat(s).isEqualTo("hello");

        AtomicBoolean called = new AtomicBoolean(false);
        pair.ifPresent((first, second) -> {
            Assertions.assertThat(first).isEqualTo(1);
            Assertions.assertThat(second).isEqualTo("hello");
            called.set(true);
        });
        Assertions.assertThat(called).isTrue();
    }

    @Test
    public void testIfPresent() {
        Pair<Long, Integer> pair1 = Pair.of(22L, 33);

        AtomicBoolean called = new AtomicBoolean(false);
        BiConsumer<Number, Number> consumer = new BiConsumer<Number, Number>() {
            @Override
            public void accept(Number first, Number second) {
                Assertions.assertThat(first).isEqualTo(22L);
                Assertions.assertThat(second).isEqualTo(33);
                called.set(true);
            }
        };

        pair1.ifPresent(consumer);
        Assertions.assertThat(called).isTrue();
    }

    @Test
    public void testEmpty() {
        Pair<Integer, String> pair = Pair.of(null, null);
        Integer i = pair.getFirst();
        String s = pair.getSecond();

        Assertions.assertThat(i).isNull();
        Assertions.assertThat(s).isNull();

        pair.ifPresent((first, second) -> {
            Assertions.fail("consumer should not be called");
        });
    }

    @Test
    public void testHalfEmpty() {
        Pair<Integer, String> pair1 = Pair.of(123, null);
        pair1.ifPresent((first, second) -> {
            Assertions.fail("consumer should not be called");
        });

        Pair<Integer, String> pair2 = Pair.of(null, "asdf");
        pair2.ifPresent((first, second) -> {
            Assertions.fail("consumer should not be called");
        });
    }

    @Test
    public void testEquals() {
        Pair<Integer, String> pair1 = Pair.of(1, "hello");
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        Pair<String, Integer> pair3 = Pair.of("hello", 1);

        Assertions.assertThat(pair1.equals(pair2)).as("pair1 equals pair2").isTrue();
        Assertions.assertThat(pair2.equals(pair1)).as("pair2 equals pair1").isTrue();
        Assertions.assertThat(pair1.hashCode()).as("pair1 hashCode == pair2 hashCode").isEqualTo(pair2.hashCode());

        Assertions.assertThat(pair3.equals(pair3)).as("pair3 equals pair3").isTrue();
        Assertions.assertThat(pair1.equals(pair3)).as("pair1 not equals pair3").isFalse();

        Pair<Long, Integer> pair4 = Pair.of(22L, 33);
        Pair<Integer, Long> pair5 = Pair.of(22, 33L);

        Assertions.assertThat(pair4.equals(pair5)).as("pair4 not equals pair5").isFalse();
    }

}
