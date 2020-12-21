package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int sec;

    public TimeSpan(int hour, int min, int sec){
        this.hour = hour;
        this.minute = min;
        this.sec = sec;
    }

    public void add(TimeSpan timeSpan){
        hour += timeSpan.getHour();
        minute += timeSpan.getMinute();
        sec += timeSpan.getSec();
    }

    public void subtract(TimeSpan timeSpan){
        hour -= timeSpan.getHour();
        minute -= timeSpan.getMinute();
        sec -= timeSpan.getSec();
    }

    public String toString(){
        return String.format("Hours: %d, minutes: %d, seconds: %d", hour, minute, sec);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
}
