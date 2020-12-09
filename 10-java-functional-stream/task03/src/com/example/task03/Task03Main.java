package com.example.task03;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task03Main {
    public static <T> void findMinMax(Stream<? extends T> stream,
                                      Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxConsumer) {
        Object[] minObjs = {null};
        Object[] maxObjs = {null};
        boolean[] startItem = {true};
        stream.forEach(current -> {
            if (startItem[0]) {
                startItem[0] = false;
                minObjs[0] = maxObjs[0] = current;
            } else if (order.compare(current, (T) minObjs[0]) < 0)
                minObjs[0] = current;
            else if (order.compare(current, (T) maxObjs[0]) > 0)
                maxObjs[0] = current;
        });
        minMaxConsumer.accept((T) minObjs[0], (T) maxObjs[0]);
    }

    public static void main(String[] args) {
        findMinMax(
                Stream.of(2, 9, 5, 4, 8, 1, 3), Integer::compareTo,
                (min, max) -> System.out.println("min: " + min + " / max: " + max)
        );
    }
}
