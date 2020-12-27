package com.example.task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task03Main {

    public static void main(String[] args) {

        findMinMax(
                Stream.of(2, 9, 5, 4, 8, 1, 3), Integer::compareTo,
                (min, max) -> System.out.println("min: " + min + " / max: " + max)
        );

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        Iterator<? extends T> iterator = stream.iterator();
        T minItem = null;
        T maxItem = null;
        if (iterator.hasNext()) {
            minItem = iterator.next();
            maxItem = minItem;
        }
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (order.compare(item, maxItem) > 0)
                maxItem = item;
            if (order.compare(item, minItem) < 0)
                minItem = item;
        }
        minMaxConsumer.accept(minItem, maxItem);
    }
}
