package com.example.task02;

import java.lang.*;

public class Task02 {

    public static String solution(String input) {
	long number = Long.parseLong(input);
        if (number <= Byte.MAX_VALUE && number >= Byte.MIN_VALUE)
            return "byte";
        else if (number <= Short.MAX_VALUE && number >= Short.MIN_VALUE)
            return "short";
        else if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) 
	    return "int";
	return "long";
    }
}
