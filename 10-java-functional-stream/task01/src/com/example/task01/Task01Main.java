package com.example.task01;

import jdk.nashorn.internal.ir.TernaryNode;
import org.assertj.core.error.ShouldNotBeNull;
import java.beans.Expression;
import java.io.IOException;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task01Main {
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        if (condition == null || ifFalse = null || ifTrue == null)
            throw new NullPointerException();
        return (x) -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }
}
