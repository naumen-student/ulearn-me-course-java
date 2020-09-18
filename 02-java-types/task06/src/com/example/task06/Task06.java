package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        String sumString = "" + sum;
        String sub = "-";
        if (sumString.contains(sub))
            return sumString.length() - 1;
        return sumString.length();
    }

    public static void main(String[] args) {
        int result = solution(-111, -222);
        System.out.println(result);

    }

}
