package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long value = Long.parseLong(input);
        String result = "long";

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        if (value >= -128 && value <= 127)
            result = "byte";
        else if (value >= -32768 && value <= 32767)
            result = "short";
        else if (value >= -2147483648 && value <= 2147483647)
            result = "int";

        return "";
        return result;
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
