package com.example.task07;

public Processor processor;

public String getExceptionType() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        String result = NONE;
        try {
        processor.process(); //todo вы можете заменить реализацию этого метода для ручного дебага
        processor.process();
        } catch (Exception e) {

        result = e instanceof RuntimeException ? UNCHECKED : CHECKED;
        }
        return null;
        return result;
        }

        }
