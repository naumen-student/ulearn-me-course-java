package com.example.task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task03Main{

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer){
        if ( stream == null )
            throw new IllegalArgumentException();
        T min = null;
        T max = null;
        Iterator<? extends T> iterator = stream.iterator();
        if ( iterator.hasNext() ) {
            min = iterator.next();
            max = min;
        }

        while (iterator.hasNext()) {
            T item = iterator.next();
            if ( order.compare(item, max) > 0 )
                max = item;
            if ( order.compare(item, min) < 0 )
                min = item;
        }

        minMaxConsumer.accept(min, max);
    }
}
