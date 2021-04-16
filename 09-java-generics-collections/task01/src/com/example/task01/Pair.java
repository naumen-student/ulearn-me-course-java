package com.example.task01;

import java.util.function.BiConsumer;


public class Pair {
    private T1 first;
    private T2 second;

    public Pair(T1 value1, T2 value2){
        this.first = value1;
        this.second = value2;
    }

    public Pair(){
    }

    public T1 getFirst(){
        return first;
    }

    public T2 getSecond(){
        return second;
    }


    public boolean equals(Pair<T1,T2> pair){
        return this.first.equals(pair.first) && this.second.equals(pair.second);
    }

    public int hashCode(){
        int hash = 0;
        int fnvPrim = 2767;
        hash += this.first.hashCode() * fnvPrim;
        hash += this.second.hashCode() * fnvPrim;
        return hash;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
        return new Pair<>(first, second);
    }

    public void ifPresent(BiConsumer consumer){
        if(first != null && second != null)
            consumer.accept(first,second);
    }
}
