package com.example.task05;
public class Task05 {
    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        int number = x;
        while (number != 0) {
            if ((number % 10) % 2 != 0)
                return "FALSE";
            number = number / 10;
        }
        return "TRUE";
    }
    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution(20);
        System.out.println(result);

    }

}