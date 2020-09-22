package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        if (sum == 0) {
            return 1;
        }
        int cnt = 0;
        while (Math.abs(sum) > 0) {
            sum /= 10;
            cnt++;
        }
        return cnt;
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
