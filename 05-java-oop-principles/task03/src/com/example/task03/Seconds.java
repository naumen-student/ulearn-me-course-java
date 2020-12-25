package com.example.task03;

public class Seconds implements TimeUnit {

    private final long num;

    public Seconds(long num) {
        this.num = num;
    }

    @Override
    public long toMillis() {
        return num * 1000;
    }

    @Override
    public long toSeconds() {
        return num;
    }

    @Override
    public long toMinutes() {
        return Math.round((double) num / 60);
    }

    @Override
    public long getHours() {
        return Math.round((double) num / 60 / 60);
    }
}
