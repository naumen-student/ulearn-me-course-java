package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int newNumber = x+y;
        return String.valueOf(Math.abs(newNumber)).length();
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
