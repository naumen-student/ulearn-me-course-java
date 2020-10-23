package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         
    }

    static long mult(int[] arr) {
    	long res= 1;
        for (int n: arr) {
			res = n*res;
		}
        return res;
        
    }

}
