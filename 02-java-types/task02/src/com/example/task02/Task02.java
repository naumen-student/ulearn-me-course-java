package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        
        long x = Long.parseLong(input);
        if (Byte.MIN_VALUE <= x && x <= Byte.MAX_VALUE)
            return "byte";
        else if (Short.MIN_VALUE <= x && x <= Short.MAX_VALUE)
            return "short";
        else if (Integer.MIN_VALUE <= x && x <= Integer.MAX_VALUE)
            return "int";
        else
            return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
