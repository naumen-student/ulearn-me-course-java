
package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        return x + y == 0 ? 1 : (int) Math.floor(Math.log10(Math.abs(x + y))) + 1;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
