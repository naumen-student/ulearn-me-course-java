package com.example.task03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task03Main {

    public static void main(String[] args) {
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        Integer[] counterIterations = new Integer[]{0};
        Object[] minMax = new Object[2];
        stream.forEach(x ->{
            if(counterIterations[0] == 0) {
                counterIterations[0] = 1;
                minMax[0] = x;
                minMax[1] = x;
            }
            else if(order.compare((T)minMax[0], x) > 0)
                minMax[0] = x;
            else if(order.compare((T) minMax[1], x) < 0)
                minMax[1] = x;});
        minMaxConsumer.accept((T) minMax[0], (T) minMax[1]);
    }
}
