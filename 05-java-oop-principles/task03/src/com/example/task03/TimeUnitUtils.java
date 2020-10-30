package com.example.task03;

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

    public static Hours getHours(TimeUnit timeUnit) {
        return new Hours(timeUnit.getHours());
    }
}
