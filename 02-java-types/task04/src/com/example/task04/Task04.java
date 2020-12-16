package com.example.task04;

import java.math.MathContext;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        if (operation == "+") {
            return (float) a + b;
        }
        if (operation == "-") {
            return (float) a - b;
        }
        if ((operation == "/") && (b != 0)) {
            return (float) a / b;
        }
        if (operation == "*") {
            return (float) a * b;
        }
        else return 0;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
