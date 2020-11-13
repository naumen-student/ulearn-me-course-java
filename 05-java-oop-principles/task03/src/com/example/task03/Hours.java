package com.example.task03;

public class Hours implements TimeUnit {

    private final long amount;

    public Hours(long amount) {
        this.amount = amount;
    }

    @Override
    public long toMillis() {
        return this.toMinutes() * 1000;
    }

    @Override
    public long toSeconds() {
        return this.toMinutes() * 60;
    }

    @Override
    public long toMinutes() {
        return amount * 60;
    }

    @Override
    public long getHours() {
        return this.amount;
    }
}