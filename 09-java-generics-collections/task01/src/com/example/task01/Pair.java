package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<T1, T2> {
    T1 first;
    T2 second;

    private Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public static <T1, T2> Pair of(T1 first, T2 second) {
        return new Pair<>(first, second);
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object pair) {
        if (this == pair)
            return true;
        if (pair == null)
            return false;
        if (getClass() != pair.getClass())
            return false;
        else {
            Pair p = (Pair) pair;
            return p.first == first && p.second == second;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public void ifPresent(BiConsumer biConsumer) {
        if (first != null && second != null)
            biConsumer.accept(first, second);
    }
}
