package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        if ( (x / 10000) % 2 != 0  ) return "FALSE";
        else if ( (x / 1000) % 2 != 0 ) return "FALSE";
        else if ( (x / 100) % 2 != 0 ) return "FALSE";
        else if ( (x / 10) % 2 != 0 ) return "FALSE";
        else if ( (x % 2 != 0)) return "FALSE";
        else return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(1234);
        System.out.println(result);

    }

}