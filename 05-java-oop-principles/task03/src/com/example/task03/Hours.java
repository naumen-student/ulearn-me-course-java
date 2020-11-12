package com.example.task03;

public class Hours implements TimeUnit{

    private final long amount;

    public Hours (long data){
        this.amount = data;
    }
    @Override
    public long toMillis() {
        return amount *60*60*1000;
    }

    @Override
    public long toSeconds() {
        return amount*60*60;
    }

    @Override
    public long toMinutes() {
        return amount*60;
    }

    @Override
    public long toHours(){
        return amount;
    }

}
