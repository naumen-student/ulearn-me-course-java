package com.example.task01;

import java.util.function.BiConsumer;

    public class Pair<T1, T2> {
        private final T1 first;
        private final T2 second;

        private Pair(T1 first, T2 second){
            this.first = first;
            this.second = second;
        }

        public T1 getFirst() {
            return first;
        }

        public T2 getSecond(){
            return second;
        }

        public void ifPresent(BiConsumer<? super T1, ? super T2> biConsumer){
            if (first != null && second != null)
                biConsumer.accept(first, second);
        }

        public boolean equals(Pair<T1, T2> pair){
            return pair.first.equals(first) && pair.second.equals(second);
        }

        public int hashCode() {
            return  31 * (first.hashCode() + second.hashCode());
        }

        public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second){
            return new Pair<>(first, second);
        }
    }