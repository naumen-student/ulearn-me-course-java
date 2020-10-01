package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        return (m / k) * (n / k);
    }

    public static void main(String[] args) {

        int result = solution(10, 20, 5);
        System.out.println(result);
    }

}
