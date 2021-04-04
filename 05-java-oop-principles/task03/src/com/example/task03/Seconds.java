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
        return amount;
    }

    @Override
    public long toMinutes() {
        if (amount % 60 < 30)
            return amount / 60;
        else
            return amount / 60 + 1;
    }

    @Override
    public long toHours(){
        if (amount % 3600 < 1800)
            return amount / 3600;
        else
            return amount / 3600 + 1;
    }
}

