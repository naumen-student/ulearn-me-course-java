package com.example.task03;

/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {

    /**
     * Конвертирует интервал в секундах в интервал в миллисекундах
     *
     * @param seconds интервал в секундах
     * @return интервал в миллисекундах
     */
    public static Milliseconds toMillis(TimeUnit timeUnit) {
        return new Milliseconds(timeUnit.toMillis());
    }

    /**
     * Конвертирует интервал в миллисекундах в интервал в секундах
     *
     * @param millis интервал в миллисекундах
     * @return интервал в секундах
     */
    public static Seconds toSeconds(TimeUnit timeUnit) {
        return new Seconds(timeUnit.toSeconds());
    }

    public static Minutes toMinutes(TimeUnit timeUnit) {
        return new Minutes(timeUnit.toMinutes());
    }

    public static Hours toHours(TimeUnit timeUnit) {
        return new Hours(timeUnit.toMinutes());
    }
}
