package com.example.task01;

import java.io.IOException;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task01Main {
    public static void main(String[] args) throws IOException {


    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        if (condition != null && ifTrue != null && ifFalse != null) {
            return (x) -> {
                if (condition.test(x)) return ifTrue.apply(x);
                return ifFalse.apply(x);
            };
        }
        throw new NullPointerException();
    }
}
