package com.example.task03;

public class TimeUnitUtils {
    
    public static Milliseconds toMillis(Seconds seconds) {
        return new Milliseconds(seconds.toMillis());
    }
    
    public static Milliseconds toMillis(TimeUnit timeUnit) {
        return new Milliseconds(timeUnit.toMillis());
    }
    
    public static Seconds toSeconds(TimeUnit timeUnit) {
        return new Seconds(timeUnit.toSeconds());
    }
    
    public static Seconds toSeconds(Milliseconds millis) {
        return new Seconds(millis.toSeconds());
    }
    
    public static Hours toHours(TimeUnit timeUnit) {
        return new Hours(timeUnit.toHours());
    }
}
