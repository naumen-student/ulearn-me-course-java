package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float result =(float)0;
        float x = (float)a;
        float y = (float)b;
        switch (operation) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
        }
        return result;

    }

    public static void main(String[] args) {

        float result = calculate(6, 1, "-");
        System.out.println(result);
    }

}
