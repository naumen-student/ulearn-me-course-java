package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float output = 0;
        if (operation == "+")
            output = a + b;
        if (operation == "-")
            output = a - b;
        if (operation == "*")
            output = a * b;
        if (operation == "/")
            output = a / b;
        return output;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
