package com.example.task03;

public class Seconds implements TimeUnit {

    private final long amount;

    public Seconds(long amount) {
        this.amount = amount;
    }

    @Override
    public long toMillis() {
        return amount * 1000;
    }

    @Override
    public long toSeconds() {
        return amount;
    }

    @Override
    public long toMinutes() {
        return Math.round((double) amount / 60);
    }

    @Override
    public long getHours() {
        return Math.round((double) amount / (60 * 60));
    }
}
