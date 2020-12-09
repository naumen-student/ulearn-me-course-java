package com.example.task03;

import org.assertj.core.util.Streams;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicReference;
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
        final T[] min = (T[]) new Object[]{null};
        final T[] max = (T[]) new Object[]{null};
        final boolean[] flag = {true};
        stream.forEach(x-> {
            if (flag[0]){
                min[0] = x;
                max[0] = x;
            }
            if (order.compare(x, min[0]) < 0)
                min[0] = x;
            if (order.compare(max[0], x) < 0)
                max[0] = x;
            flag[0] = false;
        });
        minMaxConsumer.accept(min[0], max[0]);
    }

}
