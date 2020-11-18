package com.example.task03;

import java.util.*;
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
        Map<String, T> maxAndMinEl = new HashMap<>();
        final boolean[] first = {true};
        stream.forEach(x -> {
            if (first[0]){
                maxAndMinEl.put("Min", x);
                maxAndMinEl.put("Max", x);
                first[0] = false;
            } else if(order.compare(x, maxAndMinEl.get("Min")) < 0)
                maxAndMinEl.put("Min", x);
            else if (order.compare(x, maxAndMinEl.get("Max")) > 0)
                maxAndMinEl.put("Max", x);
        });
        minMaxConsumer.accept(maxAndMinEl.get("Min"), maxAndMinEl.get("Max"));
    }
}
