package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        switch (operation){
            case "+":
                return (float)a + (float)b;
            case "-":
                return (float)a - (float)b;
            case "*":
                return (float)a * (float)b;
            case "/":
                return (float)a / (float)b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.print(calculate(25,6,"/"));
    }

}
