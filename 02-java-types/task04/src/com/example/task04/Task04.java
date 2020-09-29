package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float af=(float)a;
        float bf=(float)b;
        if (operation.equals("+"))
            return af+bf;
        if (operation.equals("-"))
            return af-bf;
        if (operation.equals("/"))
            return af/bf;
        return af*bf;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
