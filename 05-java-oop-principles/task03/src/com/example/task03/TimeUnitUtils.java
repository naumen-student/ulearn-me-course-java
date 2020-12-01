package com.example.task03;

/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {

    public static Milliseconds toMillis(TimeUnit timeU){

        return new Milliseconds(timeU.toMillis());
    }

    public static Seconds toSeconds(TimeUnit timeU){

        return new Seconds(timeU.toSeconds());
    }

    public static Minutes toMinutes(TimeUnit timeU){
        return new Minutes(timeU.toMinutes());}

    public static Hours toHours(TimeUnit timeU) {
        return new Hours(timeU.toHours());
    }
}
