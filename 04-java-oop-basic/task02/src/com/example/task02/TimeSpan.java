package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int hours, int minutes, int seconds){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void add(TimeSpan time){
        seconds += time.seconds;
        minutes = (minutes * 60 + time.minutes * 60)/ 60;
        hours = (hours * 3600 + time.hours * 3600) / 3600;
    }

    void subtract(TimeSpan time){
        seconds -= time.seconds;
        minutes = (minutes * 60 - time.minutes * 60)/ 60;
        hours = (hours * 3600 - time.hours * 3600) / 3600;
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }
}
