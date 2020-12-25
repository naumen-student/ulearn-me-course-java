package com.example.task03;

/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {


    public static Milliseconds toMillis(Seconds seconds) {
        return new Milliseconds(seconds.toMillis());
    }

    public static Hours toHours(Seconds seconds) {
        return new Hours(seconds.toHours());
    }

    public static Minutes toMinutes(Seconds seconds) {
        return new Minutes(seconds.toMinutes());
    }

    public static Seconds toSeconds(Milliseconds millis) {
        return new Seconds(millis.toSeconds());
    }

    public static Minutes toMinutes(Milliseconds millis) {
        return new Minutes(millis.toMinutes());
    }

    public static Hours toHours(Milliseconds millis) {
        return new Hours(millis.toHours());
    }

    public static Milliseconds toMilliseconds(Minutes minutes) {
        return new Milliseconds(minutes.toMillis());
    }

    public static Seconds toSeconds(Minutes minutes) {
        return new Seconds(minutes.toSeconds());
    }

    public static Hours toHours(Minutes minutes) {
        return new Hours(minutes.toHours());
    }

    public static Milliseconds toMilliseconds(Hours hours) {
        return new Milliseconds(hours.toMillis());
    }

    public static Minutes toHours(Hours hours) {
        return new Minutes(hours.toMinutes());
    }

    public static Seconds toSeconds(Hours hours) {
        return new Seconds(hours.toSeconds());
    }
}
