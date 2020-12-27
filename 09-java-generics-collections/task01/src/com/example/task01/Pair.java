package com.example.task01;


import java.util.Objects;
import java.util.function.BiConsumer;


public class Pair<T1, T2> {
    private final T1 firstValue;
    private final T2 secondValue;

    private Pair(T1 firstElement, T2 secondValue) {
        this.firstValue = firstElement;
        this.secondValue = secondValue;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 firstValue, T2 secondValue) {
        return new Pair<>(firstValue, secondValue);
    }

    public T1 getFirst() {
        return firstValue;
    }

    public T2 getSecond() {
        return secondValue;
    }

    public void ifPresent(BiConsumer<? super T1, ? super T2> consumer) {
        if (this.firstValue != null && this.secondValue != null)
            consumer.accept(this.firstValue, this.secondValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Pair<T1, T2> pair = (Pair<T1, T2>) object;
        return Objects.equals(firstValue, pair.firstValue) &&
                Objects.equals(secondValue, pair.secondValue);
    }
}