package com.example.task02;
import java.util.Scanner;

public class Main {

    public static String solution(String input) {
        long num = Long.parseLong(input);
        if (num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE)
            return ("int");
        if (num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE)
            return ("byte");
        if (num <= Short.MAX_VALUE && num >= Short.MIN_VALUE)
            return ("short");
        return ("long");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число ");
        String num = console.nextLine();
        String result = solution(num);
        System.out.println("Тип ");
        System.out.println(result);
    }
}
