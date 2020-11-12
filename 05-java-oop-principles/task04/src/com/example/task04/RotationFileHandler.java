package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler {
    /*
     * Обработчик, выводящий сообщения в файл с определенной ротацией -
     * например, для каждого часа создается свой файл
     */

    private final ChronoUnit interval;

    public RotationFileHandler(ChronoUnit interval) {
        this.interval = interval;
    }

    public void log(String message) {

        try (FileWriter writer = new FileWriter(String.format("log.txt",
                LocalDateTime.now().truncatedTo(interval).toString()), false)) {
            writer.write(message);
            writer.flush();
        } catch (IOException m) {
            System.out.println(m.toString());
        }
    }

}
