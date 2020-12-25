package com.example.task03;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import java.util.Iterator;
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

        Iterator<? extends T> iterator = stream.iterator();
        T max = null;
        T min = null;
        if (!iterator.hasNext()) {
            minMaxConsumer.accept(min, max);
            return;
        } else {
            max = iterator.next();
            min = max;
        }
        while (iterator.hasNext()) {
            T nextIterator = iterator.next();
            if (order.compare(nextIterator, max) > 0)
                max = nextIterator;
            if (order.compare(min, nextIterator) > 0)
                min = nextIterator;
        }
        minMaxConsumer.accept(min, max);
    }
}
