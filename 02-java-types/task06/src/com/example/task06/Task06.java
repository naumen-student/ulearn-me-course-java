package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int z = x + y;
        z = Math.abs(z);
        int count = 0;

        while (z > 0){
            z = z / 10;
            count++;
        }

        if (count == 0)
            return 1;
        return count;
    }

    public static void main(String[] args) {
        int result = solution(777, -777);
        System.out.println(result);
    }
}
