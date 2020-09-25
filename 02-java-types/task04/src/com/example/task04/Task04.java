package com.example.task04;

import jdk.dynalink.Operation;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        if(operation == "+")
            return (float)a + b;
        else if (operation == "-")
            return (float)a - b;
        else if (operation == "*")
            return (float) a * b;
        else
            return (float) a / b;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1 ,2, "+"));
    }

}
