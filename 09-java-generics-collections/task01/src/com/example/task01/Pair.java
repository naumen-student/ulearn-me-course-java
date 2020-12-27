package com.example.task01;
import java.util.function.BiConsumer;

public class Pair<F, S> {

    private F first; //first member of pair
    private S second; //second member of pair

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public int hashCode(){ return  first.hashCode() + second.hashCode(); }

    public boolean equals(Pair value){
        return  first.equals(value.getFirst()) && second.equals(value.getSecond());
    }

    public void ifPresent(BiConsumer pair) {
        if (first != null && second != null) {
            pair.accept(first, second);
        }
    }

    public static <F, S> Pair<F, S> of(F firstValue, S secondValue) {
        Pair<F, S> pair = new Pair(firstValue, secondValue);
        return pair;
    }
}
