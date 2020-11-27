package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long inputConvertToLong = Long.parseLong(input);
        if (inputConvertToLong >= Byte.MIN_VALUE && inputConvertToLong <= Byte.MAX_VALUE)
            return "byte";
        else if (inputConvertToLong >= Short.MIN_VALUE && inputConvertToLong <= Short.MAX_VALUE)
            return "short";
        else if (inputConvertToLong >= Integer.MIN_VALUE && inputConvertToLong <= Integer.MAX_VALUE)
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
