package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int res=x+y;
        int k =0;
        if (x+y==0){
            return 1;
        }
        else {
            while (res != 0) {
                res = res / 10;
                k += 1;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
