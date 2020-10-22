package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int testedValue=x;
        for(int i=0;i<5;i++) {
            if ((testedValue % 10) % 2 != 0)
                return "FALSE";
            testedValue=testedValue/10;
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
