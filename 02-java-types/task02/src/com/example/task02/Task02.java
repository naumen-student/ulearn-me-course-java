package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long parsedInput = Long.parseLong(input);
        if (parsedInput <= Byte.MAX_VALUE && parsedInput >= Byte.MIN_VALUE){
            return "byte";
        } else if (parsedInput <= Short.MAX_VALUE && parsedInput >= Short.MIN_VALUE){
            return "short";
        } else if (parsedInput <= Integer.MAX_VALUE && parsedInput >= Integer.MIN_VALUE){
            return "int";
        } else {
            return "long";
        }
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
