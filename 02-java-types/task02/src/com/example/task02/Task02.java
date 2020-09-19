package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long x = Long.parseLong(input);
        if (-128 <= x && x <= 127)
            return "byte";
        else if (-Math.pow(2,15) <= x && x <= Math.pow(2,15) - 1)
            return "short";
        else if (-Math.pow(2,31) <= x && x <= Math.pow(2,31) - 1)
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
