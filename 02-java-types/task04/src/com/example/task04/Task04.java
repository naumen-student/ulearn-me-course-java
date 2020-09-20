package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return (float)a / b;
            case "*":
                return a * b;
        }
        return 0;
    }
}