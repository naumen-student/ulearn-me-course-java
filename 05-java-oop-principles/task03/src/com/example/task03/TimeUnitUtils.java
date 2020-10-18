package com.example.task03;

/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {

    public static Milliseconds toMillis(TimeUnit unitOfMeasurement) {
        return new Milliseconds(unitOfMeasurement.toMillis());
    }

    public static Seconds toSeconds(TimeUnit unitOfMeasurement) {
        return new Seconds(unitOfMeasurement.toSeconds());
    }

    public static Minutes toMinutes(TimeUnit unitOfMeasurement) {
        return new Minutes(unitOfMeasurement.toMinutes());
    }

    public static Hours toHours(TimeUnit unitOfMeasurement) {
        return new Hours(unitOfMeasurement.toHours());
    }
}
