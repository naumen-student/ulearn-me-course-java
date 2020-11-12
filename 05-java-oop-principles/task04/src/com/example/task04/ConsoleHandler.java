package com.example.task04;

public class ConsoleHandler implements MessageHandler {
    /*
     *Обработчик, выводящий сообщения в консоль
     */

    @Override
    public void log(String message) {
        System.out.println(message);
    }

}
