package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int result = Integer.toString(x+y).length();
        if (x+y < 0){
            result -= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(solution(-111, -222));
    }

}
