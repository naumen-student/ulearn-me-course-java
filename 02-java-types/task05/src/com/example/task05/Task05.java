package com.example.task05;

public class Task05 {

    public static String solution(int x) {
            String string = Integer.toString(x);
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (c % 2 != 0)
                    return "FALSE";
            }
            return "TRUE";
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
