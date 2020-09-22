package com.example.task04;

import org.graalvm.compiler.core.common.calc.FloatConvert;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        switch (operation){
            case "+": return (float) a+b;
            case "-": return (float) a-b;
            case "*": return (float) a*b;
            case "/": return (float) a/b;
            default: return 0;
        }
        //#return 0;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        float result = calculate(-250, 5, "/");
        System.out.println(result);

    }

}
