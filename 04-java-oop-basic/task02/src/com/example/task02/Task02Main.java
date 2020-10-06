package com.example.task02;

class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;
    public TimeSpan() {
    }
    public TimeSpan(int hours,int minutes,int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private void normalTime() {
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;
    }
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public void add(TimeSpan time) {
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;
        normalTime();
    }
    public void subtract(TimeSpan time) {
        seconds -= time.seconds;
        minutes -= time.minutes;
        hours -= time.hours;
        normalTime();
    }
    public String toString() {
        return String.format("Timespan{hours: %d, minutes: %d, seconds: %d}", hours, minutes, seconds);
    }
}