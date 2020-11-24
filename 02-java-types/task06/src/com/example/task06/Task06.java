package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int number = x + y;
        String line = Integer.toString(number);
        int count = line.length();
        if (number < 0)
            return count - 1;
        else return count;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
