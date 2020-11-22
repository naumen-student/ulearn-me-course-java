package com.example.task03;

public class Hours implements TimeUnit {
    private final long hours;

    public Hours(long amount) {
        hours = amount;
    }

    @Override
    public long toMillis() {
        return Math.round(toSeconds() * 1e3);
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