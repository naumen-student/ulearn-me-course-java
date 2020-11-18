package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<T1, T2> {
    private final T1 first;
    private final T2 second;

    private Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
        return new Pair<T1, T2>(first, second);
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public void ifPresent(BiConsumer biConsumer){
        if(first!=null&&second!=null)
            biConsumer.accept(first,second);
    }
    // TODO напишите реализацию
}
