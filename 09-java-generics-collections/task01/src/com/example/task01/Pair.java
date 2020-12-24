package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<F1, F2> {
    private final F1 first;
    private final F2 second;

    private Pair(F1 first, F2 second) {
        this.first = first;
        this.second = second;
    }

    public F1 getFirst() {
        return first;
    }

    public F2 getSecond() {
        return second;
    }

    public boolean equals(Pair<F1, F2> pair) {
        return Objects.equals(pair.first, first) && Objects.equals(pair.second, second);
    }

    public int hashCode() {
        return Objects.hash(first,second);
    }

    public static <F1, F2> Pair<F1, F2> of(F1 first, F2 second) {
        return new Pair<>(first, second);
    }

    public void ifPresent(BiConsumer<? super F1, ? super F2> biConsumer) {
        if (first != null && second != null) {
            biConsumer.accept(first, second);
        }
    }
}
