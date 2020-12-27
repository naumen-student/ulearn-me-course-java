package com.example.task01;

import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;

import static java.util.Objects.hash;
import static java.util.Optional.ofNullable;

public class Pair<FirstType, SecondType> {
    private final Optional<FirstType> first;
    private final Optional<SecondType> second;

    private Pair(FirstType first, SecondType second) {
        this.first = ofNullable(first);
        this.second = ofNullable(second);
    }

    public static <T, S> Pair<T, S> of(T first, S second) {
        return new Pair<T, S>(first, second);
    }

    public FirstType getFirst() {
        return first.orElse(null);
    }

    public SecondType getSecond() {
        return second.orElse(null);
    }

    public void ifPresent(BiConsumer<? super FirstType, ? super SecondType> consumer) {
        if ( first.isPresent() && second.isPresent() )
            consumer.accept(first.get(), second.get());
    }

    @Override
    public boolean equals(Object o) {
        Pair<FirstType, SecondType> pair = (Pair<FirstType, SecondType>) o;
        if ( pair == null )
            return false;

        if ( this == o ) {
            return true;
        }

        return first.equals(pair.first) &&
                second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        return hash(first, second);
    }
}
