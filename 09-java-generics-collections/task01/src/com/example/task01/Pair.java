package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<TFirst,TSecond> {
    private final TFirst first;
    private final TSecond second;

    private Pair(TFirst v1, TSecond v2){
        this.first = v1;
        this.second = v2;
    }

    public TFirst getFirst() { return first; }

    public TSecond getSecond() { return second; }

    public int hashCode() { return Objects.hash(first,second); }

    public boolean equals(Pair<TFirst, TSecond> obj) { return this.hashCode() == obj.hashCode(); }

    public static <TFirst,TSecond>Pair<TFirst,TSecond> of(TFirst v1, TSecond v2){ return new Pair<>(v1, v2); }

    public void ifPresent(BiConsumer <? super TFirst, ? super TSecond> action) {
        if(first != null && second != null) action.accept(first, second);
    }
}
