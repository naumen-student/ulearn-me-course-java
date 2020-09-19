package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int res = x + y;
        int counter = 0;
        while (res != 0) {
            counter++;
            res /= 10;
        }
        if (counter == 0)
            return 1;
        return counter;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
