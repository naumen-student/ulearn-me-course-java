package com.example.task02;

    public class Task02 {
    public static String solution(String input){
            long x=Long.parseLong(input);
            if (x>=-128 && x<=127)
                return "byte";
            if (x>=-32768 && x<=32767)
                return "short";
            if (x>=-2147483648 && x<=2147483647)
                return "int";
            else
                return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
