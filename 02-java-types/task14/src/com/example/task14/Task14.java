package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        int inverseNumber = 0;
        while (value != 0) {
            inverseNumber = inverseNumber * 10 + (value % 10);
            value /= 10;
        }

        return inverseNumber;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);
    }


}
