package com.example.task03;

/**
 * Интерфейс для интервалов времени в определенных единицах
 */
public interface TimeUnit {
    long toMillis();

    long toSeconds();

    long toMinutes();

    long getHours();
}
