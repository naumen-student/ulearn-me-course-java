package com.example.task04;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Task04 {
    public static float calculate(int a, int b, String operation) {
        Map<String, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();
        operations.put("+", (x ,y) -> x + y);
        operations.put("-", (x, y) -> x - y);
        operations.put("/", (x, y) -> x / y);
        operations.put("*", (x, y) -> x * y);

        if (!operations.containsKey(operation))
            throw new IllegalArgumentException("Operation does not support");

        return operations.get(operation).apply(a ,b);
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}

