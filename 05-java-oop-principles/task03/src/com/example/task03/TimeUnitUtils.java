package com.example.task03;

public class TimeUnitUtils {
    public static Milliseconds toMillis(Seconds seconds) {
        return new Milliseconds(seconds.toMillis());
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

    public static Seconds toSeconds(Seconds seconds) {
        return seconds;
    }

    public static Minutes toMinutes(Seconds seconds) {
        return new Minutes(seconds.toMinutes());
    }

    public static Hours toHours(Seconds seconds) {
        return new Hours(seconds.toHours());
    }

    public static Seconds toSeconds(Minutes minutes) {
        return new Seconds(minutes.toSeconds());
    }

    public static Minutes toMinutes(Minutes minutes) {
        return minutes;
    }

    public static Hours toHours(Minutes minutes) {
        return new Hours(minutes.toHours());
    }

    public static Seconds toSeconds(Hours hours) {
        return new Seconds(hours.toSeconds());
    }

    public static Minutes toMinutes(Hours hours) {
        return new Minutes(hours.toMinutes());
    }

    public static Hours toHours(Hours hours) {
        return hours;
    }
}
