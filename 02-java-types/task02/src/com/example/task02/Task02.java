package com.example.task02;

public class Task02 {

    public static String solution(String input1) {
        long input = Long.parseLong(input1);
        if ((long) input >= -128 && (long) input <= 127) {
            return "byte";
        }
        if ((long) input >= -32768 && (long) input <= 32767) {
            return "short";
        }
        if ((long) input == (int) input) {
            return "int";
        }
        return "long";

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.println(result);

    }

}
