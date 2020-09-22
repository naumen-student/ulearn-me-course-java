package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        if (operation == "+")
        {
            return a+b;
        }
        if (operation == "-")
        {
            return a-b;
        }
        if (operation == "*")
        {
            return a*b;
        }
        else
            return (float)a/b;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
