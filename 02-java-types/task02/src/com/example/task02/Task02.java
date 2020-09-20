package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        try {
            Byte.parseByte(input);
        } catch (NumberFormatException e){
            try {
                Short.parseShort(input);
            } catch (NumberFormatException g){
                try {
                    Integer.parseInt(input);
                } catch (NumberFormatException d){
                    return "long";
                }
                return "int";
            }
            return "short";
        }
        return "byte";
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
