package com.example.task01;

import java.util.function.BiConsumer;

public class Pair <T, Z> {

    private final T firstValue;
    private final Z secondValue;

    private Pair(T firstValue, Z secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <T, Z> Pair<T, Z> of(T firstValue, Z secondValue) {
        Pair<T, Z> pair = new Pair(firstValue, secondValue);
        return pair;
    }

    public void ifPresent(BiConsumer pair) {
        if (firstValue != null && secondValue != null) {
            pair.accept(firstValue, secondValue);
        }
    }

    public T getFirst() {
        return firstValue;
    }

    public Z getSecond() {
        return secondValue;
    }

    public boolean equals(Pair value) {
        return firstValue.equals(value.getFirst()) && secondValue.equals(value.secondValue);
    }

    public int hashCode() {
        return firstValue.hashCode() + secondValue.hashCode();
    }
}
