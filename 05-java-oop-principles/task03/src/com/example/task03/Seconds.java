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
        return this.amount;
    }

    @Override
    public long toMinutes() {
        return Math.round(amount / 60.0);
    }

    @Override
    public long toHours() {
        return Math.round(amount / (double) (60 * 60));
    }
}