package com.example.task06;

public class Task06 {

    private static int digitsCount(int number){
        int count = 0;
        while (number != 0){
            count++;
            number /= 10;
        }
        return count != 0 ? count : 1;
    }

    public static int solution(int x, int y) {
        return digitsCount(x + y);
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
