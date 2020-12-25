package com.example.task03;

public class Hours implements TimeUnit{
    private final long amount;

    public Hours(long amount) {
        this.amount = amount;
    }

    @Override
    public long toMillis() {
        return 60 * 60 * 1000 * amount;
    }

    @Override
    public long toSeconds() {
        return 60 * 60 * amount;
    }

    @Override
    public long toMinutes() {
        return 60 * amount;
    }

    @Override
    public long getHours() {
        return amount;
    }
}
