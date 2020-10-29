package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        Long inputNumber = Long.parseLong(input);
        if (inputNumber >= -128 && inputNumber <= 128)
            return "byte";
        if (inputNumber >= Short.MIN_VALUE && inputNumber <= Short.MAX_VALUE)
            return "short";
        if (inputNumber <= Integer.MAX_VALUE && inputNumber >= Integer.MIN_VALUE)
            return "int";
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
