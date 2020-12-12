package com.example.task04;
public class Task04 {
    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        return 0;
        float first = a, second = b;
        if (operation == "+")
            return first+second;
        else if (operation == "-")
            return first-second;
        else if (operation == "/")
            return first/second;
        else if (operation == "*")
            return first*second;
        else
            return 0;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");

        float result = calculate(13, 4, "/");
        System.out.println(result);
        */
    }

}
