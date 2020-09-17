package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        switch (operation) {
            case "/": {
                return (float) a / b;
            }
            case "*": {
                return a * b;
            }
            case "-": {
                return a - b;
            }
            case "+":{
                return a + b;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
