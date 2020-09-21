package com.example.task02;
import java.util.Scanner;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long numb_by_chek = new Long(input);

        if (numb_by_chek >= Byte.MIN_VALUE && numb_by_chek <= Byte.MAX_VALUE)
            return "byte";
        else if (numb_by_chek >= Short.MIN_VALUE && numb_by_chek <= Short.MAX_VALUE)
            return "short";
        else if (numb_by_chek >= Integer.MIN_VALUE && numb_by_chek <= Integer.MAX_VALUE)
            return "int";
        else
            return "long";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);
    }

}
