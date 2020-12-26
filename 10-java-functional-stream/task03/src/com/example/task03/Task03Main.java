package com.example.task03;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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

        if (stream == null)
            throw new IllegalArgumentException();
        final List<T> pair = new ArrayList<>();
        stream.forEach(e -> {
            if (pair.size() == 0)
                pair.addAll(Arrays.asList(e, e));
            if(order.compare(e, pair.get(0)) < 0)
                pair.set(0, e);
            if(order.compare(e, pair.get(1)) > 0)
                pair.set(1, e);
        });

        if (pair.size() == 0)
            minMaxConsumer.accept(null, null);
        else
            minMaxConsumer.accept(pair.get(0), pair.get(1));
    }
}
