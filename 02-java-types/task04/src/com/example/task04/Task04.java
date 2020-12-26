package com.example.task04;
public class Task04 {

    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        if (operation.equals("+")) {
            return (float) a + b;
        } else if (operation.equals("-")) {
            return (float) a - b;
        } else if (operation.equals("*")) {
            return (float) a * b;
        } else {
            return (float) a / b;
        }
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