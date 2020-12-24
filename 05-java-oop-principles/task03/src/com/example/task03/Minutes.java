package com.example.task03;
private final long amount;
public class Minutes implements TimeUnit {

    public Minutes(long amount) {
        this.amount = amount;
    }

    @Override
    public long toMillis() {
        return amount * 60 * 1000;
    }

    @Override
    public long toSeconds() {
        return amount * 60;
    }

    @Override
    public long toMinutes() {
        return amount;;
    }
    public long toHours() {

        return Math.round(amount / 60d);
    }
}
