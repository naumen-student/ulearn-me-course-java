package com.example.task01;

import java.util.function.BiConsumer;

public class Pair<First, Second> {
    First firstValue;
    Second secondValue;
    private Pair(First first, Second second){
        this.firstValue = first;
        this.secondValue = second;
    }

    public First getFirst(){
        return firstValue;
    }

    public Second getSecond(){
        return secondValue;
    }

    public boolean equals(Pair<First, Second> pair){
        return this.hashCode() == pair.hashCode();
    }

    public int hashCode(){
        return this.secondValue.hashCode() + this.secondValue.hashCode();
    }

    public void ifPresent(BiConsumer<? super First, ? super Second> biConsumer) {
        if (firstValue != null && secondValue != null)
            biConsumer.accept(firstValue, secondValue);
    }

    public static <First, Second> Pair<First, Second> of(First firstValue, Second secondValue) {
        return new Pair<>(firstValue, secondValue);
    }
}