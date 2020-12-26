package com.example.task01;

import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Pair<T, S> {
    private T key;
    private S value;

    private Pair(T key, S value){ this.key = key; this.value = value;}



    public static <T,S> Pair<T,S> of(T key, S value) {
        return new Pair<>(key, value);
    }

    public T getFirst() {
        return this.key;
    }

    public S getSecond() {
        return this.value;
    }


    public boolean equals(Pair<T, S> second){
        return this.key.equals(second.key) && this.value.equals(second.value);
    }

    public int hashCode(){
        return this.key.hashCode() + this.value.hashCode();
    }

    public void ifPresent(BiConsumer<? super T, ? super S> action){
        if (!(this.key == null) && !(this.value == null)){
            action.accept(this.key, this.value);
        }
    }


}
