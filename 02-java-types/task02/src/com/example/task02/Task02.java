package com.example.task02;

public class Task02 {

    public static String solution(String input) {

       long number = Long.parseLong(input);
       if (-2147483648 <= number && number <= 2147483647) {
           if (-32768 <= number && number <= 32767) {
               if (-128 <= number && number <= 127) {
                       return "byte";
               }
               else {
                   return "short";
               }
           }
           else {
               return "int";
           }
       }
       else {
           return "long";
       }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution("12345");
        System.out.println(result);
    }

}
