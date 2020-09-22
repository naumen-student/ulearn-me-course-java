package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long num = Long.parseLong(input);
        if (num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE)
            return "byte";
        else if (num <= Short.MAX_VALUE && num >= Short.MIN_VALUE)
            return "short";
        else if (num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE)
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
