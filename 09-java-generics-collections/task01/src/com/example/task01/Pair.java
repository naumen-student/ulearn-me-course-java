package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<A, B> {
    private final A first;
    private final B second;

    private Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object comparable) {
        return comparable instanceof Pair && equalsPairs((Pair<?, ?>) comparable);
    }

    public boolean equalsPairs(Pair<?, ?> comparable) {
        return Objects.equals(first, comparable.first) &&
                Objects.equals(second, comparable.second);
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
        return new Pair<>(first, second);
    }

    public void ifPresent(BiConsumer<? super A, ? super B> consumer) {
        if (first != null && second != null) {
            consumer.accept(first, second);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
