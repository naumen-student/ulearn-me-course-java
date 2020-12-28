package com.example.task01;

import java.util.function.BiConsumer;

public class Pair<T, V> {
    private final T first;
    private final V second;

    private Pair(T first, V second){
        this.first = first;
        this.second = second;
    }

    public static <T, V> Pair<T, V> of(T first, V second){
        return new Pair<>(first, second);
    }

    public T getFirst(){
        return this.first;
    }

    public V getSecond(){
        return this.second;
    }

    public boolean equals(Object compared){
        if (compared instanceof Pair){
            Pair<T, V> comp = (Pair)compared;
            return comp.getFirst().equals(this.getFirst()) && (comp.getSecond().equals(this.getSecond()));
        }
        return false;
    }

    public int hashCode(){
        return this.getFirst().hashCode() + this.getSecond().hashCode();
    }

    public void ifPresent(BiConsumer<? super T, ? super V> consumer) {
        T first = this.getFirst();
        V second = this.getSecond();
        if (first != null && second != null){
            consumer.accept(first, second);
        }
    }
}
