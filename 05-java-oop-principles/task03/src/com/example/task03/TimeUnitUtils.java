package com.example.task03;

/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {
    public static Milliseconds toMillis(TimeUnit unit) {
        return new Milliseconds(unit.toMillis());
    }

    public static Seconds toSeconds(TimeUnit unit) {
        return new Seconds(unit.toSeconds());
    }

    public static Minutes toMinutes(TimeUnit unit) {
        return new Minutes(unit.toMinutes());
    }

    public static Hours toHours(TimeUnit unit) {
        return new Hours(unit.getHours());
    }
}
