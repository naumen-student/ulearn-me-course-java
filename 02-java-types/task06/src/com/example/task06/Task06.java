package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int summ = Math.abs(x + y);
        if(summ == 0)
            return 1;
        int numberCount = 0;
        while (summ > 0)
        {
            summ /= 10;
            numberCount++;
        }
        return numberCount;
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
