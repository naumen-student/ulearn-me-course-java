package com.example.task03;

/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {

    public static Milliseconds toMillis(TimeUnit timeUnit) {
        return new Milliseconds(timeUnit.toMillis());
    }

    public static Seconds toSeconds(TimeUnit timeUnit) {
        return new Seconds(timeUnit.toSeconds());
    }

    public static Minutes toMinutes(TimeUnit timeUnit) {
        return new Minutes(timeUnit.toMinutes());
    }

    public static Hours toHours(TimeUnit timeUnit) {
        return new Hours(timeUnit.toHours());
    }
}
