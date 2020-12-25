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
        final boolean[] firstElement = {true};
        final Object max[] = {null};
        final Object min[] = {null};
        stream.forEach(x -> {
            if (firstElement[0]) {
                max[0] = x;
                min[0] = x;
                firstElement[0] = false;
            }
            if (order.compare(x, (T) max[0]) > 0) {
                max[0] = x;
                return;
            }
            if (order.compare(x, (T) min[0]) < 0) {
                min[0] = x;
            }
        });
        minMaxConsumer.accept((T) min[0], (T) max[0]);
    }
}
