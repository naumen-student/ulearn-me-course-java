package com.example.task03;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    /**
     * Проверяет ожидаемое значение интервала в различных единицах с реальными
     * @param timeUnit временной интервал
     * @param expectedMillis ожидаемое количество миллисекунд
     * @param expectedSeconds ожидаемое количество секунд
     * @param expectedMinutes ожидаемое количество минут
     */
    private void testTimeUnit(TimeUnit timeUnit, long expectedMillis, long expectedSeconds, long expectedMinutes) {
        long actualMillis = timeUnit.toMillis();
        long actualSeconds = timeUnit.toSeconds();
        long actualMinutes = timeUnit.toMinutes();
        Assert.assertEquals("Количество миллисекунд не соответствует ожидаемому", expectedMillis, actualMillis);
        Assert.assertEquals("Количество секунд не соответствует ожидаемому", expectedSeconds, actualSeconds);
        Assert.assertEquals("Количество минут не соответствует ожидаемому", expectedMinutes, actualMinutes);
    }

    @Test
    public void testMilliseconds() {
        testTimeUnit(new Milliseconds(1000), 1000, 1, 0);
    }

    @Test
    public void testMilliseconds2() {
        testTimeUnit(new Milliseconds(29999), 29999, 30, 0);
    }

    @Test
    public void testMilliseconds3() {
        testTimeUnit(new Milliseconds(30000), 30000, 30, 1);
    }

    @Test
    public void testMilliseconds4() {
        testTimeUnit(new Milliseconds(1000000), 1000000, 1000, 17);
    }

    @Test
    public void testSeconds() {
        testTimeUnit(new Seconds(60), 60000, 60, 1);
    }

    @Test
    public void testSeconds2() {
        testTimeUnit(new Seconds(29), 29000, 29, 0);
    }

    @Test
    public void testSeconds3() {
        testTimeUnit(new Seconds(30), 30000, 30, 1);
    }

    @Test
    public void testMinutes() {
        testTimeUnit(new Minutes(10), 600000, 600, 10);
    }

    @Test
    public void testMinutes2() {
        testTimeUnit(new Minutes(70), 4200000, 4200, 70);
    }

    @Test
    public void testUtils() {
        Seconds seconds = TimeUnitUtils.toSeconds(new Milliseconds(1500));
        testTimeUnit(seconds, 2000, 2, 0);
    }

    @Test
    public void testUtils2() {
        Seconds seconds = TimeUnitUtils.toSeconds(new Milliseconds(1499));
        testTimeUnit(seconds, 1000, 1, 0);
    }

    @Test
    public void testUtils3() {
        Milliseconds millis = TimeUnitUtils.toMillis(new Seconds(29));
        testTimeUnit(millis, 29000, 29, 0);
    }

    @Test
    public void testUtils4() {
        Milliseconds millis = TimeUnitUtils.toMillis(new Seconds(30));
        testTimeUnit(millis, 30000, 30, 1);
    }

}
