package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long number = Long.parseLong(input);
        if(Byte.MAX_VALUE >= number && Byte.MIN_VALUE <= number)
            return "byte";
        if(Short.MAX_VALUE >= number && Short.MIN_VALUE <= number)
            return "short";
        if(Integer.MAX_VALUE >= number && Integer.MIN_VALUE <= number)
            return "int";
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
