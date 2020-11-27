package com.example.task02;

public class TimeSpan {
    private int sek;
    private int min;
    private int hour;

    public TimeSpan(int hour, int min, int sek) {
        int time = hour * 60 * 60 + min * 60 + sek;
        this.hour = time / 3600;
        time = time % 3600;
        this.min = time / 60;
        this.sek = time % 60;
    }
    void add(TimeSpan time){
        int a = hour * 60 * 60 + min * 60 + sek;
        int b = time.getTimeHour()*60*60 + time.getTimeMin()*60 + time.getTimeSek();
        a += b;
        this.hour = a / 3600;
        a = a % 3600;
        this.min = a / 60;
        this.sek = a % 60;
    }

    void subtract(TimeSpan time){
        int a = hour * 60 * 60 + min * 60 + sek;
        int b = time.getTimeHour()*60*60 + time.getTimeMin()*60 + time.getTimeSek();
        a -= b;
        this.hour = a / 3600;
        a = a % 3600;
        this.min = a / 60;
        this.sek = a % 60;
    }

    @Override
    public String toString(){
        return hour + ":" + min + ":" + sek;
    }

    public int getTimeSek() {
        return sek;
    }

    public void setTimeSek(int timeSek) {
        this.sek = timeSek;
    }

    public int getTimeMin() {
        return min;
    }

    public void setTimeMin(int timeMin) {
        this.min = timeMin;
    }

    public int getTimeHour() {
        return hour;
    }

    public void setTimeHour(int timeHour) {
        this.hour = timeHour;
    }
}
