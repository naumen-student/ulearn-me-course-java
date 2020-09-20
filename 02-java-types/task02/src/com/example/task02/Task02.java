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

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
