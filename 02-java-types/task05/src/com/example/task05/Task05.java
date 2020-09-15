package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        boolean oddFound = false;
        int length = String.valueOf(x).length();
        for (int i = 0; i < length; i++){
            int lastDigit = x % 10;
            x = x / 10;
            if (lastDigit % 2 != 0){
                oddFound = true;
            }
        }
        if (oddFound){
            return "FALSE";
        } else{
            return "TRUE";
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
