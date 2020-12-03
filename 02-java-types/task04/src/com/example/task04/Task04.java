package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float result = 0;
        float number1 = (float)a;
        float number2 = (float)b;
        
        if (operation == "*")
            result = number1 * number2;
        else if (operation == "/")
            result = number1 / number2;
        else if (operation == "+")
            result = number1 + number2;
        else if (operation == "-")
            result = number1 - number2;
        return result;
    }

    public static void main(String[] args) {

    }

}
