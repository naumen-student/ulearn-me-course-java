package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int lengthOfX = String.valueOf(x).length();
        int k = 0;
        for (int i = 1; i <= lengthOfX; i++)
        {
            int y = x % 10;
            if (y % 2 == 0)
            {
                k++;
            }
            x /= 10;
        }

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        if (k == lengthOfX) return "TRUE";
        return "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);

        String result = solution(212212);
        System.out.println(result);
        */

    }

}