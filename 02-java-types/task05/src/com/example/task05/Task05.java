package com.example.task05;

public class Task05 {

    private static boolean ContainsOnlyEven(int number) {
        while(number != 0){
            if ((number % 10) % 2 != 0){
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static String solution(int x) {

        if(ContainsOnlyEven(x)){
            return "TRUE";
        }

        return "FALSE";
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
