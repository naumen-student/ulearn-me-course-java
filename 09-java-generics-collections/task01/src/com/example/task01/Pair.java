package com.example.task01;


import java.util.function.BiConsumer;

public class Pair<T1, T2> {

    private final T1 first;
    private final T2 second;

    private Pair(T1 first, T2 item2) {
        this.first = first;
        this.second = item2;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Pair<T1, T2> pair = (Pair<T1, T2>) obj;
        return first.equals(pair.first) && second.equals(pair.second);
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((first == null) ? 0 : first.hashCode());
        result = prime * result + ((second == null) ? 0 : second.hashCode());
        return result;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 item2) {
        return new Pair<>(first, item2);
    }

    public void ifPresent(BiConsumer<? super T1, ? super T2> biConsumer) {

        if (first != null && second != null) {
            biConsumer.accept(first, second);
        }
    }
}