package com.example.task03;

public class Minutes implements TimeUnit {
    private final long minutes;

    public Minutes(long amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Значение не может быть отрицательным");
        this.minutes = amount;
    }

    @Override
    public long toMillis() {
        return Math.round(minutes * 6e4);
    }

    @Override
    public long toSeconds() {
        return minutes * 60;
    }

    @Override
    public long toMinutes() {
        return minutes;
    }

    @Override
    public long getHours() {
        return Math.round(minutes / 60.0);
    }
}
