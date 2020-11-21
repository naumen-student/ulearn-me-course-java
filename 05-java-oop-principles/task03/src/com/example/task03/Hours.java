package com.example.task03;

public class Hours implements TimeUnit{
    private final long amount;

    public Hours(long amount){
        this.amount=amount;
    }

    @Override
    public long toMillis() {
        return toSeconds() * 1000;
    }

    @Override
    public long toSeconds(){
        return amount*3600;
    }

    @Override
    public long toMinutes(){
        return amount*60;
    }

    public long toHours(){
        return amount;
    }

}
