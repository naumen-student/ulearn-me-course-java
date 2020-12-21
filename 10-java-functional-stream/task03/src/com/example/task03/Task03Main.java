package com.example.task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task03Main {

    public static void main(String[] args) {

        findMinMax(
                Stream.of(2, 9, 5, 4, 8, 1, 3),
                Integer::compareTo,
                (min, max) ->
                        System.out.println("min: " + min + " / max: " + max)
        );

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        T minElement = null;
        T maxElement = null;
        Iterator<? extends T> iterator = stream.iterator();

        boolean isFirst = true;

        while (iterator.hasNext()) {
            if (isFirst) {
                T value = iterator.next();
                minElement = value;
                maxElement = value;
                isFirst = false;
                continue;
            }

            T value = iterator.next();

            if (order.compare(minElement, value) > 0)
                minElement = value;
            if (order.compare(maxElement, value) < 0)
                maxElement = value;
        }

        minMaxConsumer.accept(minElement, maxElement);
    }
}