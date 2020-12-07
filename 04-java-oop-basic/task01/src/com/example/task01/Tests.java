package com.example.task01;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.*;

public class Tests {

    private Constructor<Point> getConstructor() {
        try {
            return Point.class.getDeclaredConstructor(int.class, int.class);
        } catch (NoSuchMethodException e) {
            throw new AssertionError("Не найден требуемый конструктор", e);
        }
    }

    @Test
    public void tetConstructor() {
        getConstructor();
    }

    private Point createPoint(int x, int y) {
        try {
            return getConstructor().newInstance(x, y);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("Невозможно создать Point", e);
        }
    }

    private static int getValue(Point p, String field) {
        try {
            Field f = Point.class.getDeclaredField(field);
            if (!f.isAccessible()) {
                f.setAccessible(true);
            }
            return (int)f.get(p);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new AssertionError(String.format("Не могу получить значение \"%s\" для Point", field), e);
        }
    }

    @Test
    public void testCreatePoint() {
        Point p = createPoint(10, 20);
        Assert.assertEquals("x не равен ожидаемому значению", 10, getValue(p, "x"));
        Assert.assertEquals("y не равен ожидаемому значению", 20, getValue(p, "y"));
    }

    @Test
    public void testFlipMethod() {
        try {
            Method flip = Point.class.getDeclaredMethod("flip");
            Assert.assertEquals("Метод flip должен возвращать void", flip.getReturnType(), void.class);
            Assert.assertEquals("Метод flip не должен принимать аргументы", 0, flip.getParameterCount());
            Assert.assertFalse("Метод flip не должен быть static", Modifier.isStatic(flip.getModifiers()));
            Point p = createPoint(10, 20);
            flip.invoke(p);
            Assert.assertEquals("x не равен ожидаемому значению", -20, getValue(p, "x"));
            Assert.assertEquals("y не равен ожидаемому значению", -10, getValue(p, "y"));
        } catch (NoSuchMethodException e) {
            throw new AssertionError("Не найден метод flip", e);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("Ошибка при вызове метода flip", e);
        }
    }

    @Test
    public void testDistanceMethod() {
        try {
            Method distance = Point.class.getDeclaredMethod("distance", Point.class);
            Assert.assertEquals("Метод distance должен возвращать double", distance.getReturnType(), double.class);
            Assert.assertFalse("Метод distance не должен быть static", Modifier.isStatic(distance.getModifiers()));
            Point p = createPoint(27, 31);
            Point p2 = createPoint(30, 27);
            Assert.assertEquals("расстояние не равно ожидаемому значению", 5d, distance.invoke(p, p2));
            Assert.assertEquals("расстояние не равно ожидаемому значению", 5d, distance.invoke(p2, p));
        } catch (NoSuchMethodException e) {
            throw new AssertionError("Не найден метод distance(Point)", e);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("Ошибка при вызове метода flip", e);
        }
    }

    @Test
    public void testToString() {
        try {
            Method toString = Point.class.getDeclaredMethod("toString");
            int modifiers = toString.getModifiers();
            Assert.assertTrue("Метод toString должен быть public", Modifier.isPublic(modifiers));
            Assert.assertFalse("Метод toString не должен быть static", Modifier.isStatic(modifiers));

        } catch (NoSuchMethodException e) {
            throw new AssertionError("Не найден метод toString", e);
        }
    }
}
