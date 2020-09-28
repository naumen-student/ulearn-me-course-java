package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int result = x+y;
        int i=0;
        if (result==0)
            return 1;
        for(int k = 0;result!=0;k++) {
            result = result / 10;
            i = i + 1;
        }


        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        return i;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
