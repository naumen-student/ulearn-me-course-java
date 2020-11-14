package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<T,U> {

    private T first;
    private U second;

    private Pair(T first, U second)
    {
        this.first=first;
        this.second=second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void ifPresent(BiConsumer<? super T,? super U> consumer) {
        if (first!=null && second!=null)
            consumer.accept(first,second);
    }

    public static <T,U> Pair of(T first, U second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
