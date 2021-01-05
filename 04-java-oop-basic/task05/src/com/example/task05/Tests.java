package com.example.task05;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.SecureRandom;
import java.text.MessageFormat;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    /**
     * Тестирование расстояния от точки до точки
     */
    @Test
    public void testPointToPoint() {
        double[] p1 = {1, 1};
        double[] p2 = {2, 2};
        final double p1toP2 = new Point(p1[0], p1[1]).getLength(new Point(p2[0], p2[1]));
        final double expected = Math.sqrt(2);
        testEquals(p1toP2, expected);
    }

    /**
     * Тестирование расстояния от точки до точки №1
     */
    @Test
    public void testPointToPoint2() {
        double[] p1 = {2534.343909, 123.358176};
        double[] p2 = {1093.723481, 453.09511543};
        final double p1toP2 = new Point(p1[0], p1[1]).getLength(new Point(p2[0], p2[1]));
        final double expected = 1477.874712820937;
        testEquals(p1toP2, expected);
    }

    /**
     * Тестирование расстояния от точки до точки №2
     */
    @Test
    public void testFieldsModificators() {
        Field[] fields = Point.class.getDeclaredFields();
        if (fields.length == 0) {
            throw new AssertionError("Не найдено полей в классе Point");
        }
        for (Field field : fields) {
            boolean isPrivate = Modifier.isPrivate(field.getModifiers());
            boolean isFinal = Modifier.isFinal(field.getModifiers());
            System.out.println(isPrivate);
            System.out.println(isFinal);
            Assert.assertFalse(MessageFormat.format("Поле {0} недостаточно инкапсулировано", field.getName()), !isPrivate && !isFinal);
        }
    }

    /**
     * Тестирование длины ломаной линии №1
     */
    @Test
    public void testPolygonalLineLength() {
        Point[] points = {
                new Point(1, 2),
                new Point(4, 6),
                new Point(8, 9),
                new Point(12, 12),
                new Point(15, 16),
        };
        PolygonalLine line = new PolygonalLine();
        line.setPoints(points);
        testEquals(line.getLength(), 20);
    }

    /**
     * Тестирование длины ломаной линии №2
     */
    @Test
    public void testPolygonalLineLength2() {
        Point[] points = {
                new Point(1, 2),
                new Point(4, 6),
                new Point(8, 9),
                new Point(12, 12),
                new Point(15, 16),
        };
        PolygonalLine line = new PolygonalLine();
        for (Point p : points) {
            line.addPoint(p);
        }
        testEquals(line.getLength(), 20);
    }

    /**
     * Тестирование длины ломаной линии №3
     */
    @Test
    public void testPolygonalLineLength3() {
        final int pointsCount = 50;
        Random random = new SecureRandom();
        Point[] points = new Point[pointsCount];
        double[] doubles = random.doubles(pointsCount * 2, -1000, 1000).toArray();
        double expectedLength = 0;
        for (int i = 0; i < pointsCount; i++) {
            double x = doubles[i * 2];
            double y = doubles[i * 2 + 1];
            points[i] = new Point(x, y);
            if (i > 0) {
                double x2 = points[i - 1].getX();
                double y2 = points[i - 1].getY();
                expectedLength += Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
            }
        }
        PolygonalLine line = new PolygonalLine();
        for (int i = 0; i < pointsCount; i++) {
            line.addPoint(points[i]);
        }
        double actualLength = line.getLength();
        testEquals(expectedLength, actualLength);
    }

    /**
     * Тестирование модификации массива точек.
     * Если этот метод падает, то скорее всего некорректно реализован метод {@link PolygonalLine#setPoints(Point[])}, который
     * заменяет внутренний массив на переданный. Корректная реализация должна копировать элементы массив, не используя переданный
     * массив в качестве хранилища
     */
    @Test
    public void testPolygonalLineArrayModification() {
        Point[] points = {
                new Point(1, 2),
                new Point(4, 6)
        };
        PolygonalLine line = new PolygonalLine();
        line.setPoints(points);
        final double expected = line.getLength();
        points[1] = new Point(10, 20);
        Assert.assertTrue("Модификация массива точек приводит к модификации ломаной линии", Math.abs(expected - line.getLength()) < 1e-8);
    }

    /**
     * Тестирование модификации массива точек
     * Если этот тест падает, то скорее всего некорректно реализован метод {@link PolygonalLine#setPoints(Point[])},
     * который добавляет передаваемые точки в "массив" точек ломаной без копирования.
     * Корректная реализация должна "копировать" не только сам массив, но еще и точку,
     * т.е. создавать новый экземпляр объекта на основе переданного.
     */
    @Test
    public void testPolygonalLinePointModification() {
        Point[] points = {
                new Point(1, 2),
                new Point(4, 6)
        };
        PolygonalLine line = new PolygonalLine();
        line.setPoints(points);
        final double expected = line.getLength();
        Field[] fields = Point.class.getDeclaredFields();
        if (fields.length > 0) {
            fields[0].setAccessible(true);
            try {
                fields[0].set(points[0], 100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Assert.assertTrue("Модификация точки приводит к модификации ломаной линии", Math.abs(expected - line.getLength()) < 1e-8);
    }

    /**
     * Тестирование модификации массива точек
     * Если этот тест падает, то скорее всего некорректно реализован метод {@link PolygonalLine#addPoint(Point)},
     * который добавляет точку к ломаной без копирования.
     * Корректная реализация должна "копировать" объект для того, чтобы внутреннее состояние ломаной не зависило от
     * внешней модификации ее составляющих точек.
     */
    @Test
    public void testPolygonalLinePointModification2() {
        Point[] points = {
                new Point(1, 2),
                new Point(4, 6)
        };
        PolygonalLine line = new PolygonalLine();
        for (Point p : points) {
            line.addPoint(p);
        }
        final double expected = line.getLength();
        Field[] fields = Point.class.getDeclaredFields();
        if (fields.length > 0) {
            fields[0].setAccessible(true);
            try {
                fields[0].set(points[0], 100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Assert.assertTrue("Модификация точки приводит к модификации ломаной линии", Math.abs(expected - line.getLength()) < 1e-8);
    }

    private void testEquals(double value1, double value2) {
        Assert.assertTrue(MessageFormat.format("Значения {0} и {1} не совпадают", value1, value2), Math.abs(value1 - value2) < 1e-8);
    }
}
