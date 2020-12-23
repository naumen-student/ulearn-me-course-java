package com.example.task03;

public class Minutes implements TimeUnit {

    public final long amount;

    public Minutes(long amount) {
        this.amount = amount;
    }

    @Override
    public long toMillis() {
        return amount * 1000 * 60;
    }

    @Override
    public long toSeconds() {
        return amount * 60;
    }

    @Override
    public long toMinutes() {
        return amount;
    }

    @Override
    public long toHours() {
        return Math.round(amount / (double) 60);
    }

    @Override
    public long getHours() {
        return amount / 60;
    }
}
