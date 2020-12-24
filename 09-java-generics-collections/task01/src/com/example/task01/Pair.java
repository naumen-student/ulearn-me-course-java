package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<T1, T2> {

    private final T1 firstElement;
    private final T2 secondElement;

    private Pair(T1 first, T2 second){
        firstElement = first;
        secondElement = second;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second){
        return new Pair<>(first, second);
    }

    public T1 getFirst(){
        return firstElement;
    }

    public T2 getSecond(){
        return secondElement;
    }

    public void ifPresent(BiConsumer<? super T1, ? super T2> biConsumer) {
        if (firstElement != null && secondElement != null)
            biConsumer.accept(firstElement, secondElement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstElement, secondElement);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pair))
            return false;
        if (this == obj)
            return true;
        Pair<T1, T2> pair = (Pair<T1, T2>) obj;
        return firstElement.equals(pair.firstElement) && secondElement.equals(pair.secondElement);
    }
}
