package com.example.task02;

public class TimeSpan {
    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void add(TimeSpan time){
        hours += time.hours % 24;
        seconds += time.seconds % 60;
        minutes += time.minutes % 60;
    }

    void subtract(TimeSpan time){
        hours += time.hours % 24;
        seconds += time.seconds % 60;
        minutes += time.minutes % 60;
        if (hours < 0)
            hours = 24 - (hours % 24);
        if (minutes < 0)
            minutes = 60 - (minutes % 60);
        if (seconds < 0)
            seconds = 60 - (seconds % 60);
    }

    public String toString(){
        return String.format("Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds);
    }
}
