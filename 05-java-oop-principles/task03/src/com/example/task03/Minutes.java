package com.example.task03;

public class Minutes implements TimeUnit {
    private final long amount;

    public Minutes(long amount) {
        // TODO: реализовать
        this.amount = amount;
    }

    @Override
    public long toHours()
    {
        return Math.round((double) amount / 60);
    }

    @Override
    public long toMillis() {
        // TODO: реализовать
        return amount * 60000;
    }

    @Override
    public long toSeconds() {
        // TODO: реализовать
        return amount * 60;
    }

    @Override
    public long toMinutes() {
        // TODO: реализовать
        return amount;
    }
}