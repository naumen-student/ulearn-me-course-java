package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0)
            throw new IllegalArgumentException("Значение не может быть отрицательным");
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0)
            throw new IllegalArgumentException("Значение не может быть отрицательным");
        this.minutes = minutes;
        stabilizer();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0)
            throw new IllegalArgumentException("Значение не может быть отрицательным");
        this.seconds = seconds;
        stabilizer();
    }

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        stabilizer();
    }

    public void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        stabilizer();
    }

    public void subtract(TimeSpan time) {
        seconds = toSeconds() - time.toSeconds();
        stabilizer();
    }

    private void stabilizer() {
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;
    }

    private int toSeconds() {
        seconds += minutes * 60 + hours * 3600;
        hours = 0;
        minutes = 0;
        return seconds;
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
