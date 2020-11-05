package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        int lengthSum = 0;
        do{
            lengthSum++;
            sum /= 10;
        }while (sum != 0);
        return lengthSum;
    }

    public static void main(String[] args) {
        System.out.println(solution(777, -777));
    }

}
