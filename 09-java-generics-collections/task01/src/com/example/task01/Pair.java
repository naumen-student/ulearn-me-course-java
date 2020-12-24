package com.example.task01;

import java.util.function.BiConsumer;

public class Pair<T1, T2> {
    private final T1 myElement1;
    private final T2 myElement2;

    private Pair(T1 myElement1, T2 myElement2) {
        this.myElement1 = myElement1;
        this.myElement2 = myElement2;
    }

    public T1 getFirst() {
        return myElement1;
    }

    public T2 getSecond() {
        return myElement2;
    }

    public boolean equals(Pair<T1, T2> pair) {
        return myElement1.equals(pair.myElement1) && myElement1.equals(pair.myElement1);
    }

    public int hashCode() {
        return myElement1.hashCode() + myElement2.hashCode();
    }

    public static <T1, T2> Pair<T1, T2> of(T1 myfirst, T2 mysecond) {
        return new Pair<>(myfirst, mysecond);
    }

    public void ifPresent(BiConsumer<? super T1, ? super T2> biConsumer) {
        if (myElement1 != null && myElement2 != null)
            biConsumer.accept(myElement1, myElement2);
    }
}