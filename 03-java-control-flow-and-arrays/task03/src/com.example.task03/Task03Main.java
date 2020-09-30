package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber)
    {
      switch (weekDaysNumber)
      {
          case 1:
              return ("Понедельник");
          case 2:
              return ("Вторник");
          case 3:
              return ("Среда");
          case 4:
              return ("четверг");
          case 5:
              return ("Пятница");
          case 6:
              return ("Суббота");
          case 7:
              return ("Воскресенье");
          default:
              return ("Такого дня недели не существует");
      }
    }
}