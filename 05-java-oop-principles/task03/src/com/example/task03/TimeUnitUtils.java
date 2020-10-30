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
     * Конвертирует интервал в минутах в интервал в миллисекундах
     *
     * @param minutes интервал в минутах
     * @return интервал в миллисекундах
     */
    public static Milliseconds toMillis(Minutes minutes) {
        return new Milliseconds(minutes.toMillis());
    }

    /**
     * Конвертирует интервал в часах в интервал в миллисекундах
     *
     * @param hours интервал в часах
     * @return интервал в миллисекундах
     */
    public static Milliseconds toMillis(Hours hours) {
        return new Milliseconds(hours.toMillis());
    }

    /**
     * Конвертирует интервал в миллисекундах в интервал в секундах
     *
     * @param minutes интервал в минутах
     * @return интервал в секундах
     * @@ -24,4 +44,84 @@ public static Milliseconds toMillis(Seconds seconds) {
     * public static Seconds toSeconds(Milliseconds millis) {
     * return new Seconds(millis.toSeconds());
     * }
     * <p>
     * /**
     * Конвертирует интервал в минутах в интервал в секундах
     */
    public static Seconds toSeconds(Minutes minutes) {
        return new Seconds(minutes.toSeconds());
    }

    /**
     * Конвертирует интервал в часах в интервал в секундах
     *
     * @param hours интервал в часах
     * @return интервал в секундах
     */
    public static Seconds toSeconds(Hours hours) {
        return new Seconds(hours.toSeconds());
    }

    /**
     * Конвертирует интервал в миллисекундах в интервал в минутах
     *
     * @param millis интервал в миллисекундах
     * @return интервал в минутах
     */
    public static Minutes toMinutes(Milliseconds millis) {
        return new Minutes(millis.toMinutes());
    }

    /**
     * Конвертирует интервал в секундах в интервал в минутах
     *
     * @param seconds интервал в секундах
     * @return интервал в минутах
     */
    public static Minutes toMinutes(Seconds seconds) {
        return new Minutes(seconds.toMinutes());
    }

    /**
     * Конвертирует интервал в часах в интервал в минутах
     *
     * @param hours интервал в часах
     * @return интервал в минутах
     */
    public static Minutes toMinutes(Hours hours) {
        return new Minutes(hours.toMinutes());
    }

    /**
     * Конвертирует интервал в миллисекундах в интервал в часах
     *
     * @param millis интервал в миллисекундах
     * @return интервал в часах
     */
    public static Hours toHours(Milliseconds millis) {
        return new Hours(millis.getHours());
    }

    /**
     * Конвертирует интервал в секундах в интервал в часах
     *
     * @param seconds интервал в секкундах
     * @return интервал в часах
     */
    public static Hours toHours(Seconds seconds) {
        return new Hours(seconds.getHours());
    }

    /**
     * Конвертирует интервал в минутах в интервал в часах
     *
     * @param minutes интервал в минутах
     * @return интервал в часах
     */
    public static Hours toHours(Minutes minutes) {
        return new Hours(minutes.getHours());
    }
}
