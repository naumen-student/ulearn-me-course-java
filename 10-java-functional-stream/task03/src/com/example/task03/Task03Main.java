package com.example.task03;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
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

        T min = null;
        T max = null;

        Iterator<? extends T> iterator = stream.iterator();

        if (iterator.hasNext()) {
            T value = iterator.next();
            min = value;
            max = value;
        }

        while (iterator.hasNext()) {
            T value = iterator.next();
            if (order.compare(min, value) > 0) {
                min = value;
            }
            if (order.compare(max, value) < 0) {
                max = value;
            }
        }

        minMaxConsumer.accept(min, max);
    }
}
