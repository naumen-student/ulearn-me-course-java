package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int number = x + y;
        int result = 0;

        while (number != 0) {
            result++;
            number /= 10;
        }
        if (result == 0)
            result++;
        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
