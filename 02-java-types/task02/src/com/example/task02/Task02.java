package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        Long num = new Long(input);
        if(num >= -128 && num <= 127) return "byte";
        else if(num >= -32768 && num <= 32767) return "short";
        else if(num >= -2147483648 && num <= 2147483647) return "int";
        else return "long";
        //return "";
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
