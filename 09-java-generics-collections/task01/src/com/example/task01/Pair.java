package com.example.task01;

import java.util.function.BiConsumer;

public class Pair<T1, T2> {
    private final T1 first;
    private final T2 seconds;

    private Pair(T1 first, T2 second) {
        this.first = first;
        this.seconds = second;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
        return new Pair<>(first, second);
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return seconds;
    }

    public boolean equals(Object compared) {
        if (compared instanceof Pair) {
            Pair<T1, T2> comp = (Pair) compared;
            return comp.getFirst().equals(this.getFirst()) && (comp.getSecond().equals(this.getSecond()));
        }
        return false;
    }

    public int hashCode() {
        return this.getFirst().hashCode() + this.getSecond().hashCode();
    }

    public void ifPresent(BiConsumer<? super T1, ? super T2> consumer) {
        if (first != null && seconds != null)
            consumer.accept(first, seconds);
    }
}
