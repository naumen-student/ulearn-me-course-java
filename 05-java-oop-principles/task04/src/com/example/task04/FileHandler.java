package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {
    /*
     * Обработчик, выводящий сообщения в файл
     */

    @Override
    public void log(String message) {

        try (FileWriter writer = new FileWriter("log.txt", false)) {
            writer.write(message);
            writer.flush();
        } catch (IOException m) {
            System.out.println(m.toString());
        }
    }

}
