package com.example.task04;

public class Line {

    private Point sectionStart;
    private Point sectionEnd;

    public Line(Point sectionStart, Point sectionEnd) {
        this.sectionStart = sectionStart;
        this.sectionEnd = sectionEnd;
    }

    public Point getP1() {
        return sectionStart;
    }

    public Point getP2() {
        return sectionEnd;
    }

    public boolean isCollinearLine(Point p) {
        // считаем длину отрезка
        double lineSegmentLength = sectionStart.distance(sectionEnd);
        // считаем расстояние от начала отрезка (sectionStart) до проверяемой точки (p)
        double distanceFromPointToStartLine = sectionStart.distance(p);
        // считаем расстояние от проверяемой точки (p) до конца отрезка (точки sectionEnd)
        double distanceFromPointToEndLine = p.distance(sectionEnd);
        // если разность lineSegmentLength с суммой distanceFromPointToStartLine и distanceFromPointToEndLine < погрешности - выводим true
        return lineSegmentLength - (distanceFromPointToStartLine + distanceFromPointToEndLine) < 1e-10;
    }

    public String toString() {
        return String.format("(%d,%d)(%d,%d)", sectionStart.x, sectionStart.y, sectionEnd.x, sectionEnd.y);
    }
}
