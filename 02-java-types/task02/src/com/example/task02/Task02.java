package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей


        long value = Long.parseLong(input);
        double bites = value > 0 ? Math.log(value) / Math.log(2) : Math.log(Math.abs(value) - 1) / Math.log(2);
        if (value == 0 || bites < 7)
            return "byte";
        else if (bites < 15)
            return "short";
        else if (bites < 31)
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
