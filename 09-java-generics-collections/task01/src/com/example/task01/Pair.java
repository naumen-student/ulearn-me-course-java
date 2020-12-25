package com.example.task01;

import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;

public class Pair<FirstType, SecondType> {
    public static <T, S> Pair<T, S> of(T first, S second) {
        return new Pair<T, S>(first, second);
    }

    private final Optional<FirstType> first;
    private final Optional<SecondType> second;

    private Pair(FirstType first, SecondType second) {
        this.first = Optional.ofNullable(first);
        this.second = Optional.ofNullable(second);
    }

    public FirstType getFirst() {
        return first.orElse(null);
    }

    public SecondType getSecond() {
        return second.orElse(null);
    }

    public void ifPresent(BiConsumer<? super FirstType, ? super SecondType> consumer) {
        if (first.isPresent() && second.isPresent())
            consumer.accept(first.get(), second.get());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Pair<FirstType, SecondType> pair = (Pair<FirstType, SecondType>) o;
        if (pair == null) return false;
        return first.equals(pair.first) &&
                second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
