package com.example.task01;
import java.util.function.BiConsumer;

public class Pair<T1, T2>
{
    private final T1 firstElement;
    private final T2 secondElement;

    private Pair(T1 firstElement, T2 secondElement)
    {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 firstElement, T2 secondElement)
    {
        return new Pair<>(firstElement, secondElement);
    }

    public T1 getFirst()
    {
        return this.firstElement;
    }

    public T2 getSecond()
    {
        return this.secondElement;
    }

    public boolean equals(Object compared)
    {
        if (compared instanceof Pair)
        {
            Pair<T1, T2> comp = (Pair) compared;
            return comp.getFirst().equals(this.getFirst()) && (comp.getSecond().equals(this.getSecond()));
        }
        return false;
    }

    public int hashCode()
    {
        return this.getFirst().hashCode() + this.getSecond().hashCode();
    }

    public void ifPresent(BiConsumer<? super T1, ? super T2> consumer)
    {
        if (firstElement != null && secondElement != null)
            consumer.accept(firstElement, secondElement);
    }
}