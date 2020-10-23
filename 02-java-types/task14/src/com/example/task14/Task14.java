package com.example.task12;

public class Task05Main {


    public static int reverse(int value) {
    	
    	

        return Integer.parseInt(new StringBuilder(String.valueOf(value)).reverse().toString());
    }

    public static void main(String[] args) {
       
        int result = reverse(345);
        System.out.println(result);
         
    }


}
