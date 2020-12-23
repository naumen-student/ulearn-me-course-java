package com.example.task03;

/**
 * Интервал в секундах
 */
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
        return Math.round(amount / (double) 60);
    }

    @Override
    public long toHours() {
        return Math.round(amount / (double) 3600);
    }

    @Override
    public long getHours() {
        return amount / 3600;
    }
}
