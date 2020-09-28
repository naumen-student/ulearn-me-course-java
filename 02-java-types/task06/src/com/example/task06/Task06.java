package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = (x + y) / 10;
        int count = 1;
        while (sum != 0)
        {
            count++;
            sum /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

    }

}
