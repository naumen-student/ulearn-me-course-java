package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int length = String.valueOf(x).length();
        int res = 0;
        String result;
        for (int i = 1; i <= length; i++) {
            if (((x % 10) % 2) == 0) {
                res++;
            }
            x /= 10;
        }
        if (res == length) {
            result = "TRUE";
        } else {
            result = "FALSE";
        }
        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
