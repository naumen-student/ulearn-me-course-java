package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

    }
}

class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
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

    private void normalizeTimeSpan() {
        long temp = hours * 3600 + minutes * 60 + seconds;
        hours = (int) (temp / 3600);
        temp %= 3600;
        minutes = (int) (temp / 60);
        seconds = (int) (temp % 60);
    }

    void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        normalizeTimeSpan();
    }

    void subtract(TimeSpan time) {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
        normalizeTimeSpan();
    }

    public String toString() {
        return String.format("h: %d, m: %d, s: %d", hours, minutes, seconds);
    }
}
