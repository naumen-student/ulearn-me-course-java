package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         
    }

    static long mult(int[] arr) {
    	int res= 1;
        for (int i = 0; i < arr.length; i++) {
			res = res*arr[i];
		}
        return res;
        
    }

}
