package com.example.task02;
public class Task02 {

    public static String solution(String input) {

        long num = Long.parseLong(input);
        if (Byte.MIN_VALUE <= num && num <= Byte.MAX_VALUE)
            return "byte";
        if (Short.MIN_VALUE <= num && num <= Short.MAX_VALUE)
            return "short";
        if (Integer.MIN_VALUE <= num && num <= Integer.MAX_VALUE)
            return "int";
        if (Long.MIN_VALUE <= num && num <= Long.MAX_VALUE)
            return "long";
        else return "Not a number";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
        String result2 = solution("100");
        System.out.println(result2);
        String result3 = solution("8");
        System.out.println(result3);
        String result4 = solution("1000000000000");
        System.out.println(result4);
        String result5 = solution("1000");
        System.out.println(result5);

    }

}