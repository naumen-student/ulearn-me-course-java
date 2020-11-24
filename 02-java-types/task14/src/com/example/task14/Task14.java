package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        return Integer.parseInt(new StringBuilder(String.valueOf(value)).reverse().toString());

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result1 = reverse(883883);
        int result2 = reverse(934923);
        int result3 = reverse(1234352);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
         */
    }


}
