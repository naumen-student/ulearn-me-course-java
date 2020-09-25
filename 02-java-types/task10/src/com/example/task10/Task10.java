package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision,float pogresh) {

        
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        if(Math.abs(a-b)<pogresh) {
        	return true;
        }
        else return false;

    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;
        float pogresh = 0.00001f;

        boolean result = compare(sum, c, 2,pogresh);
        System.out.println(result);

    }

}
