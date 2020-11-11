import java.util.function.BiConsumer;

package com.example.task01;

public class Pair<T1, T2> {

    private final T1 firstElement;
    private final T2 secondElement;

    private Pair(T1 firstElement, T2 secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 firstElement, T2 secondElement) {
        return new Pair<>(firstElement, secondElement);
    }

    public T1 getFirst() {
        return firstElement;
    }

    public T2 getSecond() {
        return secondElement;
    }

    public void ifPresent(BiConsumer<? super T1, ? super T2> biConsumer) {
        if (firstElement != null && secondElement != null)
            biConsumer.accept(firstElement, secondElement);
    }

    @Override
    public int hashCode() {
        return firstElement.hashCode() + secondElement.hashCode();
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
