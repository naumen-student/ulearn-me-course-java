package com.example.task03;

public class Minutes implements TimeUnit {

    private final long num;

    public Minutes(long num) {
        this.num = num;
    }

    @Override
    public long toMillis() {
        return num * 60 * 1000;
    }

    @Override
    public long toSeconds() {
        return num * 60;
    }

    @Override
    public long toMinutes() {
        return num;
    }

    @Override
    public long getHours() {
        return Math.round((double) num / 60);
    }
}
