package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long inp = Long.parseLong(input);
        if (inp >= Byte.MIN_VALUE && inp <= Byte.MAX_VALUE)
            return "byte";
        else if (inp <= Short.MAX_VALUE && inp >= Short.MIN_VALUE)
            return "short";
        else if (inp <= Integer.MAX_VALUE && inp >= Integer.MIN_VALUE)
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
