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
        final boolean[] flag = {true};
        stream.forEach(w -> {
            if (flag[0]) {
                max[0] = w;
                min[0] = w;
                flag[0] = false;
            } else if (order.compare(w, (T) max[0]) > 0) {
                max[0] = w;
            } else if (order.compare(w, (T) min[0]) < 0) {
                min[0] = w;
            }
        });
        minMaxConsumer.accept((T) min[0], (T) max[0]);
    }
}
