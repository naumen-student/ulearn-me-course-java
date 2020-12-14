package com.example.task03;

public class TimeUnitUtils {

    public static Milliseconds toMillis(TimeUnit time) {
        return new Milliseconds(time.toMillis());
    }

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
