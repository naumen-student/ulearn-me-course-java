package com.example.task14;

public class Task14 {
    public static int reverse(int value) {
        int tempValue = value;
        int reverseValue = 0;
        while (tempValue > 0) {
            reverseValue = reverseValue * 10 + tempValue % 10;
            tempValue /= 10;
        }

        return reverseValue;
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }
}
