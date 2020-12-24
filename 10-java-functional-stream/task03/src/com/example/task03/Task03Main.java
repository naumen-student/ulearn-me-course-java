package com.example.task03;

import java.util.Comparator;
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

        Object[] maxElement = { null };
        Object[] minElement = { null };
        boolean[] firstElement = { true };
        stream.forEach(current -> {
            if (firstElement[0]) {
                maxElement[0] = current;
                minElement[0] = current;
                firstElement[0] = false;
            } else if (order.compare(current, (T)minElement[0]) >= 0) {
                if (order.compare(current, (T)maxElement[0]) > 0)
                    maxElement[0] = current;
            } else minElement[0] = current;
        });
        minMaxConsumer.accept((T)minElement[0], (T)maxElement[0]);
    }
}
