package com.example.task03;

public class Minutes implements TimeUnit {
    private long minutes;

    public Minutes(long amount) { this.minutes = amount; }

    @Override
    public long toMillis() { return minutes * 60000; }

    @Override
    public long toSeconds() { return minutes * 60; }

    @Override
    public long toMinutes() { return minutes; }

    @Override
    public long toHours() { return Math.round(minutes / 60.0); }
}
