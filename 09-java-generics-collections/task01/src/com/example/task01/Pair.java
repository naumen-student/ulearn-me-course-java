package com.example.task01;
import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair {
    private final T1 t1;
    private final T2 t2;

    private Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

    public boolean equals(Pair<T1, T2> pair) {
        return t1.equals(pair.t1) && t1.equals(pair.t1);
    }

    public int hashCode() {
        return t1.hashCode() + t2.hashCode();
    }

    public static <T1, T2> Pair<T1, T2> of(T1 myfirst, T2 mysecond) {
        return new Pair<>(myfirst, mysecond);
    }

    public void ifPresent(BiConsumer<? super T1, ? super T2> biConsumer) {
        if (t1 != null && t2 != null)
            biConsumer.accept(t1, t2);
}
