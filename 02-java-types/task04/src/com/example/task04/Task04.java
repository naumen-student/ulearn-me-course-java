package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float result;
        float numb1 = (float) a;
        float numb2 = (float) b;
        if (operand.equals("+")) {
            result = numb1 + numb2;
            return result;
        }
        if (operand.equals("-")) {
            result = numb1 - numb2;
            return result;
        }
        if (operand.equals("/")) {
            result = numb1 * numb2;
            return result;
        }

        return numb1 * numb2;
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
