package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        int s1 = n * m;
        int s2 = k * k;

        return s1 / s2;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(20, 50, 3);
        System.out.println(result);

    }

}
