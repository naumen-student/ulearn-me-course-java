package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    int getHour(){
        return hour;
    }

    int getMinute(){
        return minute;
    }

    int getSecond(){
        return second;
    }

    void setHour(int hour){
        this.hour = hour;
    }

    void setMinute(int minute){
        this.minute = minute;
    }

    void setSecond(int second){
        this.second = second;
    }

    void add(TimeSpan time){
        this.hour += time.hour;
        this.minute += time.minute;
        this.second += time.second;
    }

    void subtract(TimeSpan time){
        this.hour -= time.hour;
        this.minute -= time.minute;
        this.second -= time.second;
    }

    public String toString(){
        return String.format("(%d, %d, %d)", hour, minute, second);
    }
}
