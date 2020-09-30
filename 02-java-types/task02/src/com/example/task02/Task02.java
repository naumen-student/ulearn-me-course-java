package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long value = Long.parseLong(input);
        if(value <= Byte.MAX_VALUE && value >= Byte.MIN_VALUE)
            return "byte";
        if(value <= Short.MAX_VALUE && value >= Short.MIN_VALUE)
            return "short";
        if(value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE)
            return "int";
        if(value <= Long.MAX_VALUE && value >= Long.MIN_VALUE)
            return "long";
        return "некорректный ввод";
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
