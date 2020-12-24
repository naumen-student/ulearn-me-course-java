package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long a = Long.parseLong(input);
        if (a <= Byte.MAX_VALUE && a >= Byte.MIN_VALUE) {
            return "byte";
        }

        if (a <= Short.MAX_VALUE && a >= Short.MIN_VALUE) {
            return "short";
        }
        if (a <= Integer.MAX_VALUE && a >= Integer.MIN_VALUE) {
            return "int";
        }

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

