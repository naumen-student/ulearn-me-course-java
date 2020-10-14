package com.example.task03;

/**
 * Интервал в миллисекундах
 */
public class Milliseconds implements TimeUnit {

    private final long amount;

    public Milliseconds(long amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Не может быть отрицательным");
        this.amount = amount;
    }
    public long toMillis() {
        return amount;
    }

    public long toSeconds() {
        return Math.round( 1.0*amount / 1000);
    }

    public long toMinutes() {
        return Math.round(1.0* amount / 1000 / 60);
    }

    public long toHours() {
        return Math.round(1.0* amount / 1000 / 60/60);
    }
}
