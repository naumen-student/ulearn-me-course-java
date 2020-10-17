package com.example.task03;

/**
 * Интервал в секундах
 */
public class Seconds implements TimeUnit {

    private final long seconds;

    public Seconds(long seconds) {
        this.seconds = seconds;
    }

    @Override
    public long toMillis() {
        return seconds * 1000;
    }

    @Override
    public long toSeconds() {
        return seconds;
    }

    @Override
    public long toMinutes() {
        return Math.round(seconds / 60.0);
    }

    @Override
    public long toHours() {
        return Math.round(seconds / 3060.0);
    }
}
