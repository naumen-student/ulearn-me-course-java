package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int count = 0;
        int sum = x + y;
        if (sum == 0){
            return 1;
        }
        else{
            while (sum != 0){
                count += 1;
                sum /= 10;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        int result1 = solution(1,2);
        int result2 = solution(12, 34);
        int result3 = solution(100,1);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
