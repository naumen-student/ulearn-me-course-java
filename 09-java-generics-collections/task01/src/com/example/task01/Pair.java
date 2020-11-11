package com.example.task01;

import java.util.function.BiConsumer;

public class Pair<T1, T2> {
    private final T1 value1;
    private final T2 value2;

    private Pair(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 value1, T2 value2) {
        return new Pair<>(value1, value2);
    }

    public T1 getFirst() {
        return value1;
    }

    public T2 getSecond() {
        return value2;
    }

    public boolean equals(Pair<T1, T2> pair) {
        return pair.value1.equals(this.value1) && pair.value2.equals(this.value2);
    }

    public int hashCode() {
        return value1.hashCode() + value2.hashCode();
    }

    public void ifPresent(BiConsumer<? super T1, ? super T2> consumer) {
        if (this.value1 != null && this.value2 != null)
            consumer.accept(this.value1, this.value2);
    }
}
