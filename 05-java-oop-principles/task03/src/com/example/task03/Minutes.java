package com.example.task03;

import java.math.BigDecimal;

public class Minutes implements TimeUnit {
    private final long amount;

    public Minutes(long amount) {
        this.amount = amount;
    }

    @Override
    public long toMillis() {
        return amount * 60000;
    }

    @Override
    public long toSeconds() {
        return amount * 60;
    }

    @Override
    public long toMinutes() {
        return amount;
    }

    @Override
    public long getHours() {
        BigDecimal temp = new BigDecimal(amount / 60d);
        return temp.setScale(0, BigDecimal.ROUND_HALF_UP).longValue();
    }
}
