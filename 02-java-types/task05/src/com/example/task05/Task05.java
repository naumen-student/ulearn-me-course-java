package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String onlyEven = "TRUE";
        while(x > 0) {
            int digit = x % 10;
            if(digit % 2 != 0) {
                onlyEven = "FALSE";
            }
            x /= 10;
        }

        return onlyEven;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
