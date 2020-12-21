package com.example.task03;
/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {

    /**
     * Конвертирует интервал в секундах в интервал в миллисекундах
     * Конвертирует интервал в одной из единиц измерения времени в интервал в миллисекундах
     *
     * @param seconds интервал в секундах
     * @param timeUnit переводимый интервал
     * @return интервал в миллисекундах
     */
    public static Milliseconds toMillis(Seconds seconds) {
        return new Milliseconds(seconds.toMillis());
    }
    public static Milliseconds toMillis(TimeUnit timeUnit) {
        return new Milliseconds(timeUnit.toMillis());
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
}
    /**
     * Конвертирует интервал в миллисекундах в интервал в секундах
     * Конвертирует интервал в одной из единиц измерения времени в интервал в секундах
     *
     * @param millis интервал в миллисекундах
     * @param timeUnit переводимый интервал
     * @return интервал в секундах
     */
    public static Seconds toSeconds(Milliseconds millis) {
        return new Seconds(millis.toSeconds());
        public static Seconds toSeconds(TimeUnit timeUnit) {
            return new Seconds(timeUnit.toSeconds());
        }

        /**
         * Конвертирует интервал в одной из единиц измерения времени в интервал в минутах
         *
         * @param timeUnit переводимый интервал
         * @return интервал в минутах
         */
        public static Minutes toMinutes(TimeUnit timeUnit) {
            return new Minutes(timeUnit.toMinutes());
        }

        /**
         * Конвертирует интервал в одной из единиц измерения времени в интервал в часах
         *
         * @param timeUnit переводимый интервал
         * @return интервал в часах
         */
        public static Hours toHours(TimeUnit timeUnit) {
            return new Hours(timeUnit.toHours());
        }
    }