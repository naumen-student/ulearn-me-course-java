package com.example.task03;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

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

        BigDecimal temp = new BigDecimal( amount / 1000d);
        return temp.setScale(0, BigDecimal.ROUND_HALF_UP).longValue();
    }

    @Override
    public long toMinutes() {
        BigDecimal temp = new BigDecimal( amount / 1000 / 60d);
        return temp.setScale(0, BigDecimal.ROUND_HALF_UP).longValue();
    }

    @Override
    public long getHours() {
        BigDecimal temp = new BigDecimal(amount / 1000 / 3600d);
        return temp.setScale(0, BigDecimal.ROUND_HALF_UP).longValue();
    }
}
