package com.example.task03;

import java.math.BigDecimal;

/**
 * Интервал в секундах
 */
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
        BigDecimal temp = new BigDecimal(amount / 60d);
        return temp.setScale(0, BigDecimal.ROUND_HALF_UP).longValue();
    }

    @Override
    public long getHours() {
        BigDecimal temp = new BigDecimal(amount / 3600d);
        return temp.setScale(0, BigDecimal.ROUND_HALF_UP).longValue();
    }
}
