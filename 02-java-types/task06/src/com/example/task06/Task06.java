package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        x = Math.abs(x + y);
        y = 1;
        while (x > 9) {
            x /= 10;
            y++;
        }
        return y;
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
