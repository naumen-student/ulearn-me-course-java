package com.example.task01;

import java.util.function.BiConsumer;

public class Pair<T1, T2> {
    private final T1 first;
    private final T2 second;

    private Pair(T1 firstElement, T2 secondElement) {
        this.first = firstElement;
        this.second = secondElement;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public boolean equals(Pair<T1, T2> pair) {
        return first.equals(pair.first) && second.equals(pair.second);
    }

    public int hashCode() {
        return this.first.hashCode() + this.second.hashCode();
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
        return new Pair<>(first, second);
    }

    public void ifPresent(BiConsumer consumer) {
        if (first != null && second != null)
            consumer.accept(first, second);
    }
}
