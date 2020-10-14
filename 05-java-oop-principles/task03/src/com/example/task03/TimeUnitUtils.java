package com.example.task03;

public class TimeUnitUtils {


    public static Minutes toMinutes(Milliseconds millis) {
        return new Minutes(millis.toMinutes());
    }
    public static Milliseconds toMilliseconds(Minutes minutes) {
        return new Milliseconds(minutes.toMillis());
    }

    public static Hours toHours(Minutes minutes) { return new Hours(minutes.toHours()); }

    public static Minutes toHours(Hours hours) { return new Minutes(hours.toMinutes()); }
}
