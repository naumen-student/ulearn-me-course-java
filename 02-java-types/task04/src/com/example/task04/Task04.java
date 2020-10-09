package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        float res;
        char op = operation.charAt(0);
        if(op == '-') res = a - b;
        else if(op == '+') res = a + b;
        else if(op == '/') res = (float)a / b;
        else res = a * b;
        return res;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        //float result = calculate(-25, 5, "/");
        //System.out.println(result);

    }

}
