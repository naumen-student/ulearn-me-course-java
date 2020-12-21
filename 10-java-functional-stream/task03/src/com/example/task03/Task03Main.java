package com.example.task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

@@ -22,6 +23,29 @@ public static void main(String[] args) {
        Comparator<? super T> order,
        BiConsumer<? super T, ? super T> minMaxConsumer) {

        // your implementation here
        T minElement = null;
        T maxElement = null;
        Iterator<? extends T> iterator = stream.iterator();

        boolean isFirst = true;

        while (iterator.hasNext()) {
        if (isFirst) {
        T value = iterator.next();
        minElement = value;
        maxElement = value;
        isFirst = false;
        continue;
        }

        T value = iterator.next();

        if (order.compare(minElement, value) > 0)
        minElement = value;
        if (order.compare(maxElement, value) < 0)
        maxElement = value;
        }

        minMaxConsumer.accept(minElement, maxElement);
        }
        }