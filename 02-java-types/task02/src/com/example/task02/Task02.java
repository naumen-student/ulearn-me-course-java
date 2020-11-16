package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);
        String result = "";
        if ((number >= - 128) && (number <= 127)) {
            result = "byte";
        } else if ((number >= -Math.pow(2, 15)) && (number <= (Math.pow(2, 15) -1))) {
            result = "short";
        } else if ((number >= -Math.pow(2, 31)) && (number <= (Math.pow(2, 31) -1))) {
            result = "int";
        } else if ((number >= -Math.pow(2, 63)) && (number <= (Math.pow(2, 63) -1))) {
            result = "long";
        }
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
