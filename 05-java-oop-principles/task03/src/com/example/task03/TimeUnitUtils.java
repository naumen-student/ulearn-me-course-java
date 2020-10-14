package com.example.task03;

/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {

    /**
     * Конвертирует интервал в секундах в интервал в миллисекундах
     *
     * @param units
     * @return интервал в миллисекундах
     */
    public static Milliseconds toMillis(TimeUnit units) {
        return new Milliseconds(units.toMillis());
    }

    /**
     * Конвертирует интервал в миллисекундах в интервал в секундах
     *
     * @param units
     * @return интервал в секундах
     */
    public static Seconds toSeconds(TimeUnit units) {
        return new Seconds(units.toSeconds());
    }

    public static Minutes toMinutes(TimeUnit units) { return new Minutes(units.toMinutes()); }

    public static Hours toHours(TimeUnit units) { return new Hours(units.toHours()); }
}
