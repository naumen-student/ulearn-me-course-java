package com.example.task03;
public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (weekDaysNumber > 7 || weekDaysNumber < 1)
            throw new IllegalArgumentException("Неверный день недели");
        String[] days = new String[]{"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        return days[weekDaysNumber - 1];
    }
}