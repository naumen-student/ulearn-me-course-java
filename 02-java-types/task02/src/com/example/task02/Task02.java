package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long a = Long.parseLong(input);
        if (a<=127 && a>=-128)
            return "byte";
        else
            if (a>=Math.pow(-2,15) && a<-128 || a>127 && a<=Math.pow(2,15)-1)
                return "short";
            else
                if (a>=Math.pow(-2,31) && a<Math.pow(-2,15) || a>Math.pow(2,15)-1 && a<=Math.pow(2,31)-1)
                    return "int";
                else
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
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
