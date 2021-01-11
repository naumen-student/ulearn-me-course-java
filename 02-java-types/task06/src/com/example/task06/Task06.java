package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int result = x + y;
        //int sum = 0;
        //while(result >= 0){
        //Суммирование цифр числа
        //   sum++;
        //    result/=10;
        //}
        //return sum;

        //return (int)Math.log10(result)+1; не работает с отрицательными
        if (result >= 0) return String.valueOf(result).split("").length ;
        else return String.valueOf(result).split("").length -1;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(1, 1);
        System.out.println(result);

    }

}
