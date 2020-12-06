package com.example.task02;

public class TimeSpan {
    private int hour;
    private int min;
    private int sec;

    public TimeSpan(int sec, int min, int hour){
        this.hour = hour + min / 60 + sec / 3600;
        this.min = (min + (sec / 60)) % 60;
        this.sec = sec % 60;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0)
            throw new IllegalArgumentException("cannot be a negative parameter");
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min < 0)
            throw new IllegalArgumentException("cannot be a negative parameter");
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec < 0)
            throw new IllegalArgumentException("cannot be a negative parameter");
        this.sec = sec;
    }

    public void add(TimeSpan time) {
        TimeSpan result = new TimeSpan(toSeconds() + time.toSeconds(), 0, 0);
        sec = result.getSec();
        min = result.getMin();
        hour = result.getHour();
    }

    public void subtract(TimeSpan time) {
        TimeSpan result = new TimeSpan(toSeconds() - time.toSeconds(), 0, 0);
        sec = result.getSec();
        min = result.getMin();
        hour = result.getHour();
    }

    private int toSeconds() {
        return sec + min * 60 + hour * 3600;
    }

    @Override
    public String toString() {
        return String.format("sec: %d, min: %d, hour: %d", sec, min, hour);
    }
}