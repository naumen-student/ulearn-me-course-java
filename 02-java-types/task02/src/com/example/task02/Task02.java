package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long a = Long.parseLong(input);
        if (a<=Byte.MAX_VALUE && a>=Byte.MIN_VALUE)
            return "byte";
        else
            if (a>=Short.MIN_VALUE && a<=Short.MAX_VALUE)
                return "short";
            else
                if (a>=Integer.MIN_VALUE &&  a<=Integer.MAX_VALUE)
                    return "int";
                else
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
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
