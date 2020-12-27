package com.example.task01;

import java.util.function.BiConsumer;

public class Pair<T1, T2> {
    private final T1 item1;
    private final T2 item2;

    private Pair(T1 item1, T2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T1 getItem1(){
        return item1;
    }

    public T2 getItem2(){
        return item2;
    }

    public boolean equals(Pair<T1, T2> pair){
        return pair.item1.equals(this.item1) && pair.item2.equals(this.item2);
    }

    public int hashCode(){
        return item1.hashCode() ^ item2.hashCode();
    }

    public void ifPresent(BiConsumer<? super T1, ? super T2> biConsumer) {
        if (item1 != null && item2 != null)
            biConsumer.accept(item1, item2);
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
        return new Pair<>(first, second);
    }
}