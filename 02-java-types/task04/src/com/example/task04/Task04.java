package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float num1 = a, num2 = b;

        if (operation == "+") return num1+num2;
        else if (operation == "-") return num1-num2;
        else if (operation == "/") return num1/num2;
        else if (operation == "*") return num1*num2;
        else return 0;
    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}

