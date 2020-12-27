package com.example.task01;

import java.util.function.BiConsumer;

public class Pair<K, V> {
    private K key;
    private V value;

    private Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<K, V> of(K key, V value) {
        return new Pair<>(key, value);
    }

    public K getFirst() {
        return this.key;
    }

    public V getSecond() {
        return this.value;
    }

    public boolean equals(Pair<K, V> second) {
        return this.key.equals(second.key) && this.value.equals(second.value);
    }

    public int hashCode() {
        return this.key.hashCode() + this.value.hashCode();
    }

    public void ifPresent(BiConsumer<? super K, ? super V> action) {
        if (this.key == null || this.value == null) {
            return;
        }
        action.accept(this.key, this.value);
    }
}
