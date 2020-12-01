package com.example.task03;

public class Hours implements TimeUnit{
    final long Amount;

    public Hours(long amount) {
        Amount = amount;
    }

    @Override
    public long toMillis() {
        return Amount * 3600000;
    }

    @Override
    public long toSeconds() {
        return Amount * 3600;
    }

    @Override
    public long toMinutes() {
        return Math.round(Amount * 60);
    }
}
