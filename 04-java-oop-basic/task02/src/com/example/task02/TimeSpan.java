package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    void add(TimeSpan time) {
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;
        checkAddTime(this.minutes, this.hours);
        checkAddTime(this.seconds, this.minutes);
    }

    void subtract(TimeSpan time) {
        seconds -= time.seconds;
        minutes -= time.minutes;
        hours -= time.hours;
        checkSubtract(this.minutes, this.hours);
        checkSubtract(this.seconds, this.minutes);
    }

    void checkAddTime(int checkingTime, int bTime){
        if (checkingTime > 59){
            bTime += 1;
            checkingTime -= 60;
        }
    }

    void checkSubtract(int checkingTime, int bTime){
        if (checkingTime < 1){
            bTime -= 1;
            checkingTime += 60;
        }
    }

    public String toString() {
        return String.format("Hours:%d, Minutes:%d, Seconds:%d", hours, minutes, seconds);
    }
}
