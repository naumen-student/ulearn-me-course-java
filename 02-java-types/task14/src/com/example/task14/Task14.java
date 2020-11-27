package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке

        String num1 = Integer.toString(value);
        String str_num1 = new StringBuilder(num1).reverse().toString();
        int result_num = new Integer(str_num1);
        return result_num;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
