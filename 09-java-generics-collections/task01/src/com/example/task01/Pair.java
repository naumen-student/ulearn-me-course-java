package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<TFirst, TSecond> {
    private final TFirst first;
    private final TSecond second;

    private Pair(TFirst first, TSecond second){
        this.first = first;
        this.second = second;
    }

    public TFirst getFirst() {
        return first;
    }

    public TSecond getSecond(){
        return second;
    }

    public void ifPresent(BiConsumer<? super TFirst, ? super TSecond> biConsumer){
        if (first != null && second != null)
            biConsumer.accept(first, second);
    }

    public boolean equals(Pair<TFirst, TSecond> pair){
        return pair.first.equals(first) && pair.second.equals(second);
    }

    public int hashCode() {
        return Objects.hash(first, second);
    }

    public static <TFirst, TSecond> Pair<TFirst, TSecond> of(TFirst first, TSecond second){
        return new Pair<>(first, second);
    }
}
