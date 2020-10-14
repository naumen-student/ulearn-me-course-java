package com.example.task03;

public class Minutes implements TimeUnit {
    private final long minutes;

    public Minutes(long minutes) {
        if (minutes < 0)
            throw new IllegalArgumentException("Minutes cannot be less than 0");
        this.minutes = minutes;
    }

    @Override
    public long toMillis() {
        return toSeconds() * 1000;
    }

    @Override
    public long toSeconds() {
        return minutes * 60;
    }

    @Override
    public long toMinutes() {
        return minutes;
    }

    @Override
    public long getHours() {
        return Math.round(minutes / 60.0);
    }
}