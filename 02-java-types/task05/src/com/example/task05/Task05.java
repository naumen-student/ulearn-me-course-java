package com.example.task05;
public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        while(x!= 0){
            int number = x%10;
            if(number % 2 != 0)
                return "FALSE";
            x /= 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(1234);
        System.out.println(result);
        result = solution(2222);
        System.out.println(result);
    }

}
