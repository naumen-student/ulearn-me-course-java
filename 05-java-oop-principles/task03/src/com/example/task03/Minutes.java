package com.example.task03;

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
    public long toHours(){
        if(amount%60 >= 30)
            return (amount/60)+1;
        return amount / 60;
    }
}
