package com.example.task03;

public class Minutes implements TimeUnit {

    private final long amount;

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
        return amount;
    }

    public long toHours(){
        return Math.round(amount * 1.0 / 60);
    }

    public long getHours(){
        return this.toHours();
    }
}
