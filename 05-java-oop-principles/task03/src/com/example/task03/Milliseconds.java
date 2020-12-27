package com.example.task03;

/**
 * Интервал в миллисекундах
 */
public class Milliseconds implements TimeUnit {

    private final long amount;

    public Milliseconds(long amount) {
        this.amount = amount;
    }

    @Override
    public long toMillis() {
        return amount;
    }

    @Override
    public long toSeconds() {
        return Math.round((float) this.toMillis() / 1000);
    }

    @Override
    public long toMinutes() {
        return Math.round((float) this.toMillis() / 60 / 1000);
    }

    @Override
    public long getHours() { return Math.round((float) this.toMillis() / 60  / 60 / 1000); }
}
