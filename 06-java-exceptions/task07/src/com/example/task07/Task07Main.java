package com.example.task07;

import java.io.IOException;

public class Task07Main {

    public static final String CHECKED = "checked";
    @@ -16,9 +18,14 @@ public String getExceptionType() {
        try {
            processor.process(); //todo вы можете заменить реализацию этого метода для ручного дебага
        } catch (Exception e) {

            if (e instanceof IOException) {
                return CHECKED;
            }
            else {
                return UNCHECKED;
            }
        }
        return null;
        return NONE;
    }

}