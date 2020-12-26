package com.example.task01;

import java.util.function.BiConsumer;

    public class Pair<T1, T2> {
        private final T1 firstElement;
        private final T2 secondElement;

        private Pair(T1 firstElement, T2 secondElement) {
            this.firstElement = firstElement;
            this.secondElement = secondElement;
        }

        public T1 getFirst() {
            return firstElement;
        }

        public T2 getSecond() {
            return secondElement;
        }

        public boolean equals(Pair<T1, T2> pair) {
            return firstElement.equals(pair.firstElement) && secondElement.equals(pair.secondElement);
        }

        public int hashCode() {
            return firstElement.hashCode() + secondElement.hashCode();
        }

        public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
            return new Pair<>(first, second);
        }

        public void ifPresent(BiConsumer<? super T1, ? super T2> biConsumer) {
            if (firstElement != null && secondElement != null)
                biConsumer.accept(firstElement, secondElement);
        }
    }
