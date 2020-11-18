package com.example.task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task03Main {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        Iterator<? extends T> iterator = stream.iterator();
        if (!iterator.hasNext()){
            minMaxConsumer.accept(null, null);
            return;
        }
        T min = iterator.next();
        T max = min;
        while (iterator.hasNext()){
            T elem = iterator.next();
            if (order.compare(elem, min) < 0) {
                min = elem;
            }
            if (order.compare(elem, max) > 0){
                max = elem;
            }
        }
        minMaxConsumer.accept(min, max);
    }
}
