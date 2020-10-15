package com.example.task03;

public class TimeUnitUtils {

    public static Milliseconds toMillis(Seconds seconds) {
        return new Milliseconds(seconds.toMillis());
    }

    public static Seconds toSeconds(Milliseconds millis) {
        return new Seconds(millis.toSeconds());
    }

    public static Minutes toMinutes(Minutes minutes) {
        return new Minutes(minutes.toMinutes());
    }

    public static Hours toHours(Hours hours) {
        return new Hours(hours.getHour());
    }
}
