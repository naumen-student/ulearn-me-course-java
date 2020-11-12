package com.example.task01;
import java.util.function.BiConsumer;

public class Pair<T1, T2> {
    private final T1 firstEl;
    private final T2 secondEl;

    private Pair(T1 firstEl, T2 secondEl) {
        this.firstEl = firstEl;
        this.secondEl = secondEl;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 firstEl, T2 secondEl) {
        return new Pair<>(firstEl, secondEl);
    }

    public T1 getFirst() {
        return this.firstEl;
    }

    public T2 getSecond() {
        return this.secondEl;
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
        if (firstEl != null && secondEl != null)
            consumer.accept(firstEl, secondEl);
    }
}
