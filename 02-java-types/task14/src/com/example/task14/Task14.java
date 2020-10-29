package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String soso = Integer.toString(value);
        String res = new StringBuilder(soso).reverse().toString();
        int gg = new Integer(res);
        return gg;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = reverse(4721);
        System.out.println(result);

    }


}
