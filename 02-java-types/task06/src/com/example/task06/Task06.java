package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int res = 1, sum = x + y;
        while(Math.abs(sum) > 9){
            res++;
            sum /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        //int result = solution(23, 32);
        //System.out.println(result);

    }

}
