package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long number = Long.parseLong(input);

        return "";
        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
            return "byte";
        else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
            return "short";
        else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
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
