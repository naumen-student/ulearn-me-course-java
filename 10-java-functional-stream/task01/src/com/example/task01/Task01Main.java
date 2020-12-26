package com.example.task01;

import java.io.IOException;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task01Main {
    public static void main(String[] args) throws IOException {

    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> myTest,
            Function<? super T, ? extends U> ifMyTestTrue,
            Function<? super T, ? extends U> ifMyTestFalse) {

        if (myTest != null && ifMyTestTrue != null && ifMyTestFalse != null)
            return x -> myTest.test(x) ? ifMyTestTrue.apply(x) : ifMyTestFalse.apply(x);
        throw new NullPointerException();
    }
}