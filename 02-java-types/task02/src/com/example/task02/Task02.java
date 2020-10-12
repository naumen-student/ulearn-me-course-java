package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        if (Long.parseLong(input) == (byte)Long.parseLong(input))
            return "byte";
        if (Long.parseLong(input) == (short)Long.parseLong(input))
            return "short";
        if (Long.parseLong(input) == (int)Long.parseLong(input))
            return "int";
        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String res  ult = solution("12345");
        System.out.println(result);
         */
    }

}
