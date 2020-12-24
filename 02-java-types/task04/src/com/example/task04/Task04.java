package com.example.task04;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
public class Task04 {

    public static float calculate(int a, int b, String operation) {
        Map<String, BiFunction<Float, Float, Float>> operations = new HashMap<>();
        operations.put("+", (x ,y) -> x + y);
        operations.put("-", (x, y) -> x - y);
        operations.put("/", (x, y) -> x / y);
        operations.put("*", (x, y) -> x * y);
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        if (!operations.containsKey(operation))
            throw new IllegalArgumentException("Operation does not support");
        return operations.get(operation).apply((float) a, (float) b);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
