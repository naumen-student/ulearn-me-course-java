package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long fromString = Long.parseLong(input);
        if (fromString <= Byte.MAX_VALUE && fromString >= Byte.MIN_VALUE)
            return "byte";
        else if (fromString <= Short.MAX_VALUE && fromString >= Short.MIN_VALUE)
            return "short";
        else if (fromString <= Integer.MAX_VALUE && fromString >= Integer.MIN_VALUE)
            return "int";
        else return "long";
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
