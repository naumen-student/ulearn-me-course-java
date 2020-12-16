package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<TFirst, TSecond> {
    private final TFirst firstValue;
    private final TSecond secondValue;

    private Pair() {
        this.firstValue = null;
        this.secondValue = null;
    }

    private Pair(TFirst first, TSecond second) {
        this.firstValue = first;
        this.secondValue = second;
    }

    public static <T, V> Pair<T, V> of(T firstValue, V secondValue) {
        return new Pair<>(firstValue, secondValue);
    }

    public TFirst getFirst() {
        return firstValue;
    }

    public TSecond getSecond() {
        return secondValue;
    }

    public void ifPresent(BiConsumer<? super TFirst, ? super TSecond> action) {
        if (firstValue != null && secondValue != null) {
            action.accept(firstValue, secondValue);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Pair)) {
            return false;
        }

        Pair<?, ?> other = (Pair<?, ?>) obj;
        return Objects.equals(firstValue, other.firstValue) && Objects.equals(secondValue, other.secondValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue);
    }
}
