package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<T, V> {
    private final T firstValue;
    private final V secondValue;

    private Pair(T firstValue, V secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static Pair of(Object firstValue, Object secondValue){
        return new Pair(firstValue, secondValue);
    }

    public T getFirst() {
        return firstValue;
    }

    public V getSecond() {
        return secondValue;
    }

    public void ifPresent(BiConsumer consumer){
        if (this.firstValue != null && this.secondValue != null)
            consumer.accept(this.firstValue, this.secondValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(firstValue, pair.firstValue) &&
                Objects.equals(secondValue, pair.secondValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue);
    }
}
