package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int side1 = n / k;
        int side2 = m / k;
        return side1 * side2;
    }

    public static void main(String[] args) {
        int result = solution(10, 20, 5);
        System.out.println(result);
    }
}
