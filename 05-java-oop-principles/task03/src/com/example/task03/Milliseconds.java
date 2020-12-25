package com.example.task03;

/**
 * Интервал в миллисекундах
 */

public class Milliseconds implements TimeUnit {

    private final long millis;

    public Milliseconds(long millis) {
        this.millis = millis;
    }

    @Override
    public long toMillis() {
        return millis;
    }

    @Override
    public long toSeconds() {
        return Math.round(millis / 1000.0);
    }

    @Override
    public long toMinutes() {
        return Math.round(millis / 60000.0);
    }

    @Override
    public long toHours() {
        return Math.round(millis / 3600000.0);
    }
}
