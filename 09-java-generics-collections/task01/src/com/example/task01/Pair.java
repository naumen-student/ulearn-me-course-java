package com.example.task01;

import java.util.function.BiConsumer;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    private Pair() {}

    private Pair(T1 f, T2 s) {
        this.first = f;
        this.second = s;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public boolean equals(Pair s) {
        return first.equals(s.first) && second.equals(s.second);
    }

    public int hashCode() {
        return first.hashCode() + second.hashCode();
    }

    public static <T1, T2> Pair<T1, T2> of(T1 f, T2 s) {
        return new Pair<>(f, s);
    }

    public void ifPresent(BiConsumer o) {
        if (first != null && second != null) {
            o.accept(first, second);
        }
    }
}
