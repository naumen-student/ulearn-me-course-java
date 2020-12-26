package com.example.task06;
public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int z = x + y;
        z = Math.abs(z);
        int count = 0;


        while (z > 0)
        {
            z = z / 10;
            count++;
        }

        if (count == 0)
            return 1;
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        int result = solution(777, -777);
        System.out.println(result);
        */
    }
}