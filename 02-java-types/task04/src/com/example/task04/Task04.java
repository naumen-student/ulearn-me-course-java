package com.example.task04;

public class Task04 {

    public static float calculate(int number1, int number2, String operand) {
        float result;
        float numb1 = (float) number1;
        float numb2 = (float) number2;
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
