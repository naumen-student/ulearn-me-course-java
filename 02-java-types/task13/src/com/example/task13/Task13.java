package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

	        String s =""+c;

	        return s.toUpperCase().charAt(0);
	    }

	    public static void main(String[] args) {
	        
	        char result = toUpperCase('q');
	        System.out.println(result);
	       
	    }

	}
