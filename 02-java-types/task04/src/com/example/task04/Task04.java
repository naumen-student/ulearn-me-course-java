package com.example.task04;

public class Task04 {
    public static float calculate(int a, int b, String operation) {
       if (operation == "+")
           return a+b;
       if (operation == "-")
           return a-b;
       if (operation == "*")
           return a*b;
       return (float) a/b;
    }
}
