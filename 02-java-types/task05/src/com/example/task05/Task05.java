package com.example.task05;

public class Task05 {

    public static String solution(int x) {
         boolean flag = true;
         for (int i = 0; i < 5; i++) {
             if ((x%10)%2 != 0 )
                 flag = false;
             x /= 10;
         }
        return flag ? "TRUE" : "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution(1234);
        System.out.println(result);
    }

}
