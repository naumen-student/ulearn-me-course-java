package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<T1, T2>{
    private T1 first;
    private T2 second;

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    private Pair() {
    }

    private Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public static <T3, T4> Pair<T3, T4> of(T3 first, T4 second) {
        return new Pair<>(first, second);
    }

    public void ifPresent(BiConsumer consumer) {
        if (first != null && second != null)
            consumer.accept(first, second);
    }
}
