package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        long summa = x + y;
        if (summa == 0) {
            return 1;
        }
        int result = 0;
        while (summa != 0) {
            result++;
            summa /= 10;
        }
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
