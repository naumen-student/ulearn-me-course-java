package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат

    }

    static long mult(int[] arr) {
        long res=1;
        if (arr.length==0){
            return 0;
        }
        else{
            for  (int i:arr)
                res*=i;
        }
        return res;
    }

}