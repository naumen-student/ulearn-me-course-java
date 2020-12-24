package com.example.task02;
public class Task02 {

    public static String solution(String input) {
        long inputValue = Long.parseLong(input);
        String result;
        if(inputValue >= -128 && inputValue <= 127)
            result = "byte";
        else if(inputValue >= -32768 && inputValue <= 32767)
            result = "short";
        else if(inputValue >= -2147483648 && inputValue <= 2147483647)
            result = "int";
        else
            result = "long";
        return result;
    }

    // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей



   public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.println(result);

    }
}
