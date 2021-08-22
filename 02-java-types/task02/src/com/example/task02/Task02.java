package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long num = Long.parseLong(input);
        if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE)
            return "byte";
        if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
            return "short";
        if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
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
