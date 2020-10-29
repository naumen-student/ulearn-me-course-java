package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long numbers = Long.parseLong(input);
        if (Byte.MAX_VALUE >= numbers & numbers >= Byte.MIN_VALUE)
            return "byte";
        else if (Short.MAX_VALUE >= numbers & numbers >= Short.MIN_VALUE)
            return "short";
        else if (Integer.MAX_VALUE >= numbers & numbers >= Integer.MIN_VALUE)
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
