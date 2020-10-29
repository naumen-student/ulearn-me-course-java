package com.example.task03;

/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {

    /** все типы конвертируются в миллисекунды **/
    public static Milliseconds toMillis(Milliseconds millis) {
        return new Milliseconds(millis.toMillis());
    }

    public static Milliseconds toMillis(Seconds seconds) {
        return new Milliseconds(seconds.toMillis());
    }

    public static Milliseconds toMillis(Minutes minutes) {
        return new Milliseconds(minutes.toMillis());
    }

    public static Milliseconds toMillis(Hours hours) {
        return new Milliseconds(hours.toMillis());
    }

    /** все типы конвертируются в секунды **/
    public static Seconds toSeconds(Milliseconds millis) {
        return new Seconds(millis.toSeconds());
    }

    public static Seconds toSeconds(Seconds seconds) {
        return new Seconds(seconds.toSeconds());
    }

    public static Seconds toSeconds(Minutes minutes) {
        return new Seconds(minutes.toSeconds());
    }

    public static Seconds toSeconds(Hours hours) {
        return new Seconds(hours.toSeconds());
    }

    /** все типы конвертируются в минуты **/
    public static Minutes toMinutes(Milliseconds millis) {
        return new Minutes(millis.toMinutes());
    }

    public static Minutes toMinutes(Seconds seconds) {
        return new Minutes(seconds.toMinutes());
    }

    public static Minutes toMinutes(Minutes minutes) {
        return new Minutes(minutes.toMinutes());
    }

    public static Minutes toMinutes(Hours hours) {
        return new Minutes(hours.toMinutes());
    }

    /** все типы конвертируются в часы **/
    public static Hours getHours(Milliseconds millis) {
        return new Hours(millis.getHours());
    }

    public static Hours getHours(Seconds seconds) {
        return new Hours(seconds.getHours());
    }

    public static Hours getHours(Minutes minutes) {
        return new Hours(minutes.getHours());
    }

    public static Hours getHours(Hours hours) {
        return new Hours(hours.getHours());
    }
}
