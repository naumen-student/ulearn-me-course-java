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
    public static Milliseconds toMillis(Seconds seconds) {
        return new Milliseconds(seconds.toMillis());
    }

    /**
     * Конвертирует интервал в миллисекундах в интервал в секундах
     *
     * @param millis интервал в миллисекундах
     * @return интервал в секундах
     */
    public static Seconds toSeconds(Milliseconds millis) {
        return new Seconds(millis.toSeconds());
    }

    public static Milliseconds toMillis(Minutes minutes) { return new Milliseconds(minutes.toMillis()); }

    public static Milliseconds toMillis(Hours hours) { return new Milliseconds(hours.toMillis()); }

    public static Seconds toSeconds(Minutes minutes) { return new Seconds(minutes.toSeconds()); }

    public static Seconds toSeconds(Hours hours) {
        return new Seconds(hours.toSeconds());
    }

    public static Minutes toMinutes(Milliseconds milliseconds) {
        return new Minutes(milliseconds.toSeconds());
    }

    public static Minutes toMinutes(Seconds seconds) {
        return new Minutes(seconds.toSeconds());
    }

    public static Minutes toMinutes(Hours hours) {
        return new Minutes(hours.toSeconds());
    }

    public static Hours toHours(Milliseconds milliseconds) {
        return new Hours(milliseconds.toSeconds());
    }

    public static Hours toHours(Seconds seconds) {
        return new Hours(seconds.toSeconds());
    }

    public static Hours toHours(Minutes minutes) {
        return new Hours(minutes.toSeconds());
    }

}
