package com.example.task03;

/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {

    /**
     * Конвертирует интервал в секундах в интервал в миллисекундах
     *
     * @param units интервал в времени
     * @return интервал в миллисекундах
     */
    public static Milliseconds toMillis(TimeUnit units) {
        return new Milliseconds(units.toMillis());
    }

    /**
     * Конвертирует интервал в миллисекундах в интервал в секундах
     *
     * @param units интервал времени
     * @return интервал в секундах
     */
    public static Seconds toSeconds(TimeUnit units) {
        return new Seconds(units.toSeconds());
    }


    /**
     * Конвертирует интервал в интервал в минутах
     *
     * @param units интервал времени
     * @return интервал в минутах
     */
    public static Minutes toMinutes(TimeUnit units) {
        return new Minutes(units.toMinutes());
    }

    /**
     * Конвертирует интервал в миллисекундах в интервал в часах
     *
     * @param units интервал времени
     * @return интервал в часах
     */
    public static Hours toHours(TimeUnit units) {
        return new Hours(units.getHours());
    }

}
