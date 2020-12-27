package com.example.task03;

public class TimeUnitUtils {
    public static Milliseconds toMillis(TimeUnit units) {
        return new Milliseconds(units.toMillis());
    }

    public static Seconds toSeconds(TimeUnit units) {
        return new Seconds(units.toSeconds());
    }

    public static Minutes toMinutes(TimeUnit units) {
        return new Minutes(units.toMinutes());
    }

    public static Hours toHours(TimeUnit units) {
        return new Hours(units.toHours());
    }
}
