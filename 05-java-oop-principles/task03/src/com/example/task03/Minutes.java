package com.example.task03;

public class Minutes implements TimeUnit {

    final long Amount;

    public Minutes(long amount) {
        Amount = amount;
    }

    @Override
    public long toMillis() {
        return Amount * 60000;
    }

    @Override
    public long toSeconds() {
        return Amount * 60;
    }

    @Override
    public long toMinutes() {
        return Amount;
    }
}
