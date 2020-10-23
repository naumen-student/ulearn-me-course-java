package com.example.task13;

public class Task13 {

    public static char solution(char c) {

	        String s =""+c;

	        return s.toUpperCase().charAt(0);
	    }

	    public static void main(String[] args) {
	        
	        char result = solution('x');
	        System.out.println(result);
	       
	    }

	}
