package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long parseInput = Long.parseLong(input);
        if (parseInput >= -128 && parseInput <= 127)
            return "byte";
        else if (parseInput >= -32768 && parseInput <= 32767)
            return "byte";
        else if (parseInput >= -2147483648 && parseInput <= 2147483647)
            return "byte";
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
