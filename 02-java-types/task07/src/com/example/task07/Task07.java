package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        n /= k;
        m /= k;
        n *= k;
        m *= k;
        int area = n * m;
        int tent = k * k;
        return (area / tent);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(20, 50, 3);
        System.out.println(result);

    }

}
