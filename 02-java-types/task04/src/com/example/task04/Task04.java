package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {


        float result = 0;
        switch (operation){
            case "+" : result = (float) a + (float) b;
            break;
            case "-" : result = (float) a - (float) b;
            break;
            case "/" : result = (float) a / (float) b;
            break;
            case "*" : result = (float) a * (float) b;
            break;
        }

        return result;
    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
