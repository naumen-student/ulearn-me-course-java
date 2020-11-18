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

        Object[] max = {null};
        Object[] min = {null};
        boolean[] first = {true};

        stream.forEach(x -> {
            if (first[0]) {
                min[0] = x;
                max[0] = x;
                first[0] = false;}
            else if (order.compare(x, (T) min[0]) < 0)
                min[0] = x;
            else if (order.compare(x, (T) max[0]) > 0)
                max[0] = x;
        });
        minMaxConsumer.accept((T) min[0], (T) max[0]);
    }
}
