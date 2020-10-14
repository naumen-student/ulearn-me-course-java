package com.example.task03;

public class Hours implements TimeUnit {
    private final long hours;

    public Hours(long hours) {
        if (hours < 0)
            throw new IllegalArgumentException("Hours cannot be less than 0");
        this.hours = hours;
    }

    @Override
    public long toMillis() {
        return toSeconds() * 1000;
    }

    @Override
    public long toSeconds() {
        return hours * 3600;
    }

    @Override
    public long toMinutes() {
        return hours * 60;
    }

    @Override
    public long getHours() {
        return hours;
    }
}