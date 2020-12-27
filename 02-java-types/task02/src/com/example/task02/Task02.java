package com.example.task02;

public class Task02 {

    public static float benefit(float sum, float percent) {

            // TODO исправьте функцию, чтобы избежать накопления ошибки

            for (int i = 1; i <= 12; i++) {
                sum += sum * percent;
            }
            return (float) (sum * Math.exp(12 * Math.log(1.0 + percent)));
        }


    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
