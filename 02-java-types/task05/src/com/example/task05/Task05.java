package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        char[] numbers = (""+x).toCharArray();
        int len = numbers.length;
        for (char number : numbers) {
            if (number % 2 != 0)
                return "FALSE";
        }
        return "TRUE";
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
