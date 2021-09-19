package com.example.task02;
import static java.lang.Long.parseLong;

public class Task02 {

    public static String solution(String input) {
        long num = parseLong(input);
        if(num >= -128 && num <= 127) {
            return ("byte");
        } else if(num <= Math.pow(2, 15) - 1 && num >= Math.pow(2, 15) * -1) {
            return ("short");
        } else if(num <= Math.pow(2, 31) - 1 && num >= Math.pow(2, 31) * -1) {
            return ("int");
        } else if(num <= Math.pow(2, 63) - 1 && num >= Math.pow(2, 63) * -1) {
            return ("long");
        }

        return "";
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
