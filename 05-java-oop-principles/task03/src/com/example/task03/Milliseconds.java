package com.example.task03;

/**
 * Интервал в миллисекундах
 */
public class Milliseconds implements TimeUnit {

    private final long milliseconds;

    public Milliseconds(long milliseconds) {
        if (milliseconds < 0)
            throw new IllegalArgumentException("Value cannot be less than 0");
        this.milliseconds = milliseconds;
    }

    @Override
    public long toMillis() {
        return milliseconds;
    }

    @Override
    public long toSeconds() {
        return Math.round(milliseconds / 1000.0);
    }

    @Override
    public long toMinutes() {
        return Math.round(milliseconds / 1000.0 / 60.0);
    }

    @Override
    public long getHours() {
        return Math.round(toMinutes() / 60.0);
    }
}