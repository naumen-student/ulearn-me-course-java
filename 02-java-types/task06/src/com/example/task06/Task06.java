package com.example.task06;

public class Task06 {
    public static int checkNegative(int value){
        if(value < 0)value *= -1;
        return value;
    }

    public static int solution(int x, int y) {
        return String.valueOf(checkNegative(x + y)).length();
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
