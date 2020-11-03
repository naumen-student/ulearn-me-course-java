package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while (x>0){
            int y = x% 10;
            x = x /10;
            if (y % 2 != 0)
                return "FALSE";
        }
        return "TRUE";
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
