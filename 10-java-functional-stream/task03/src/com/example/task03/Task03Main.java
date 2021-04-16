package com.example.task03;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import java.util.Iterator;

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

        Iterator<? extends T> iterator = stream.iterator();
        if(!iterator.hasNext())
            minMaxConsumer.accept(null,null);
        else{
            T minElement = iterator.next();
            T maxElement = minElement;
            while (iterator.hasNext()){
                T element = iterator.next();
                if(order.compare(element,maxElement) > 0)
                    maxElement = element;
                if(order.compare(element,minElement) < 0)
                    minElement = element;
            }
            minMaxConsumer.accept(minElement,maxElement);
        }
    }
}
