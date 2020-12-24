package com.example.task03;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task03Main {

    public static void main(String[] args) { }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        Object[] max = {null};
        Object[] min = {null};
        boolean[] isFirst = {true};
        stream.forEach(e -> {
            if (isFirst[0]) {
                max[0] = e;
                min[0] = e;
                isFirst[0] = false;
            } else if (order.compare(e, (T) max[0]) > 0) max[0] = e;
            else if (order.compare(e, (T) min[0]) < 0) min[0] = e;
        });
        minMaxConsumer.accept((T) min[0], (T) max[0]);
    }
}
