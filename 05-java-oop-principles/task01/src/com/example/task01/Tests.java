package com.example.task01;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    private final Class<?> LOGGER_CLASS;

    {
        try {
            LOGGER_CLASS = Class.forName("com.example.task01.Logger");
        } catch (ClassNotFoundException e) {
            throw new AssertionError("Не найден ожидаемый класс логгера", e);
        }
    }

    private Method getLoggerMethod(String methodName, int argsCount) {
        Method[] methods = Arrays.stream(LOGGER_CLASS.getDeclaredMethods())
                .filter(m -> m.getName().equals(methodName))
                .filter(m -> m.getParameterCount() == argsCount)
                .toArray(Method[]::new);
        if (methods.length == 0) {
            throw new AssertionError(MessageFormat.format("Не найден метод {0} c количеством параметров {1}", methodName, argsCount));
        }
        if (methods.length > 1) {
            throw new AssertionError(MessageFormat.format("Найдено несколько методов {0} c количеством параметров {1}", methodName, argsCount));
        }
        return methods[0];
    }

    @Test
    public void testGetNameMethod() {
        Method method = getLoggerMethod("getName", 0);
        if (method.getReturnType() != String.class) {
            throw new AssertionError("Метод getName() должен возвращать String");
        }
    }

    @Test
    public void testGetLevelMethod() {
        Method getter = getLoggerMethod("getLevel", 0);
        if (getter.getReturnType() == Void.class) {
            throw new AssertionError("Метод getLevel() должен возвращать значение");
        }
    }

    @Test
    public void testSetLevelMethod() {
        Method setter = getLoggerMethod("setLevel", 1);
    }

    @Test
    public void testInfoMethod() {
        Method info = getLoggerMethod("info", 1);
        if (info.getParameterTypes()[0] != String.class) {
            throw new AssertionError("Аргумент метода info должен быть String");
        }
        info = getLoggerMethod("info", 2);
        if (info.getParameterTypes()[0] != String.class) {
            throw new AssertionError("Первый аргумент метода info должен быть String");
        }
        if (!info.isVarArgs() || info.getParameterTypes()[1] != Object[].class) {
            throw new AssertionError("Второй аргумент метода info должен быть Object...");
        }
    }

    @Test
    public void testDebugMethod() {
        Method debug = getLoggerMethod("debug", 1);
        if (debug.getParameterTypes()[0] != String.class) {
            throw new AssertionError("Аргумент метода debug должен быть String");
        }
        debug = getLoggerMethod("debug", 2);
        if (debug.getParameterTypes()[0] != String.class) {
            throw new AssertionError("Первый аргумент метода debug должен быть String");
        }
        if (!debug.isVarArgs() || debug.getParameterTypes()[1] != Object[].class) {
            throw new AssertionError("Второй аргумент метода debug должен быть Object...");
        }
    }

    @Test
    public void testWarningMethod() {
        Method warning = getLoggerMethod("warning", 1);
        if (warning.getParameterTypes()[0] != String.class) {
            throw new AssertionError("Аргумент метода warning должен быть String");
        }
        warning = getLoggerMethod("warning", 2);
        if (warning.getParameterTypes()[0] != String.class) {
            throw new AssertionError("Первый аргумент метода warning должен быть String");
        }
        if (!warning.isVarArgs() || warning.getParameterTypes()[1] != Object[].class) {
            throw new AssertionError("Второй аргумент метода warning должен быть Object...");
        }
    }

    @Test
    public void testErrorMethod() {
        Method error = getLoggerMethod("error", 1);
        if (error.getParameterTypes()[0] != String.class) {
            throw new AssertionError("Аргумент метода error должен быть String");
        }
        error = getLoggerMethod("error", 2);
        if (error.getParameterTypes()[0] != String.class) {
            throw new AssertionError("Первый аргумент метода error должен быть String");
        }
        if (!error.isVarArgs() || error.getParameterTypes()[1] != Object[].class) {
            throw new AssertionError("Второй аргумент метода error должен быть Object...");
        }
    }

    @Test
    public void testGetLoggerMethod() {
        getGetLoggerMethod();
    }

    @Test
    public void testLogMessage() {
        try {
            Object logger = getGetLoggerMethod().invoke(LOGGER_CLASS, "test");
            Method error = getLoggerMethod("error", 1);
            PrintStream out = System.out;
            PrintStream err = System.err;
            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PrintStream testStream = new PrintStream(baos);
                System.setOut(testStream);
                System.setErr(testStream);
                error.invoke(logger, "test message");
                String message = new String(baos.toByteArray(), StandardCharsets.UTF_8).trim();
                Pattern p = Pattern.compile("\\[([^]]+)\\] \\d{4}\\.\\d{2}\\.\\d{2} \\d{2}:\\d{2}:\\d{2} (.*) - (.*)");
                Matcher m = p.matcher(message);
                if (!m.matches()) {
                    throw new AssertionError("Сообщение не соответсвует ожидаемому шаблону: [ERROR] YYYY.MM.DD hh:mm:ss test - test message");
                }
                String level = m.group(1);
                String loggerName = m.group(2);
                String loggerMessage = m.group(3);

                Assert.assertEquals("Уровень важности не соответствует ожидаемому", "ERROR", level);
                Assert.assertEquals("Имя логгера не соответствует ожидаемому", "test", loggerName);
                Assert.assertEquals("Сообщение логгера не соответствует ожидаемому", "test message", loggerMessage);

            } finally {
                System.setOut(out);
                System.setErr(err);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private Method getGetLoggerMethod() {
        Method getLogger = getLoggerMethod("getLogger", 1);
        int modifiers = getLogger.getModifiers();
        if (!Modifier.isPublic(modifiers)) {
            throw new AssertionError("Метод getLogger должен быть публичным");
        }
        if (!Modifier.isStatic(modifiers)) {
            throw new AssertionError("Метод getLogger должен быть статическим");
        }
        if (getLogger.getParameterTypes()[0] != String.class) {
            throw new AssertionError("Аргумент метода getLogger должен быть String");
        }
        if (getLogger.getReturnType() != LOGGER_CLASS) {
            throw new AssertionError("Метод getLogger должен возвращать Logger");
        }
        return getLogger;
    }

}
