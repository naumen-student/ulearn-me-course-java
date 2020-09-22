package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int s=(x+y)/10;
        int k=1;
        while (s !=0) {
            k = k +1;
            s = s / 10;
        }
        return k;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
