package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        n = n / k;
        m = m / k;
        return (n * m);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(1000000, 1000000, 50);
        System.out.println(result);

    }

}
