package com.example.task01;

public class Pair<T, G> {
    private final T first;
    private final G second;

    private Pair(T first, G second){
        this.first = first;
        this.second = second;
    }

    public static<T, G> Pair<T, G> of(T first, G second){
        return new Pair<>(first, second);
    }

    public T getFirst(){
        return first;
    }

    public G getSecond(){
        return second;
    }

    public boolean equals(Pair<T,G> value){
        return this.hashCode() == value.hashCode();
    }

    public int hashCode(){
        return (first.hashCode() * 13) ^ (second.hashCode() * 13);
    }

    public void ifPresent(java.util.function.BiConsumer func){
        if(!(first == null) && !(second == null))
        func.accept(first,second);
    }
}
