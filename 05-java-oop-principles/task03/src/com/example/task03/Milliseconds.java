package com.example.task03;

/**
 * Интервал в миллисекундах
 */
public class Milliseconds implements TimeUnit {

    private final long amount;

    public Milliseconds(long amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Значение не может быть отрицательным");
        this.amount = amount;
    }

    @Override
    public long toMillis() {
        return amount;
    }

    @Override
    public long toSeconds() {
        return Math.round(amount / 1000.0);
    }

    @Override
    public long toMinutes() {
        return Math.round(amount / 6e4);
    }

    @Override
    public long getHours() {
        return Math.round(toMinutes() / 60.0);
    }
}
