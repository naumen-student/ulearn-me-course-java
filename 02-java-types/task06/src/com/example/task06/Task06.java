package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int sum = x + y;
        int result = 0;
        while(sum != 0) {
            result += 1;
            sum /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = solution(625, 5324);
        System.out.println(result);
    }

}
