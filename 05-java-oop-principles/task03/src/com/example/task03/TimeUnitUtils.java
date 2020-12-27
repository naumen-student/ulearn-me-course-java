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
    public static Milliseconds toMillis(TimeUnit time) {
        return new Milliseconds(time.toMillis());
    }
    /**
     * Конвертирует интервал в миллисекундах в интервал в секундах
     *
     * @param millis интервал в миллисекундах
     * @return интервал в секундах
     */
    public static Seconds toSeconds(TimeUnit time) {
        return new Seconds(time.toSeconds());
    }

    public static Minutes toMinutes(TimeUnit time) {
        return new Minutes(time.toMinutes());
    }

    public static Hours toHours(TimeUnit time) {
        return new Hours(time.toHours());
    }
}
