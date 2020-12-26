package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float result;
        switch (operation) {
            case "+":
                result = (float) a + b;
                break;
            case "-":
                result = (float) a - b;
                break;
            case "*":
                result = (float) a * b;
                break;
            default:
                result = (float) a / b;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
