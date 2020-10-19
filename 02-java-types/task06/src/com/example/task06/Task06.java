package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int num = x + y;
        String sum = Integer.toString(num);
        int result = sum.length();
        if (num < 0)
            return result - 1;
        return result;
    }

    public static void main(String[] args) {
        int result = solution(625, 5324);
        System.out.println(result);
    }

}
