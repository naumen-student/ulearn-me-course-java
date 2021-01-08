package com.example.task04;

public class Line {
    private Point start;
    private Point end;

    public Line(Point p1, Point p2){
        start = p1;
        end = p2;
    }

    public Point getStartPoint(){
        return start;
    }

    public Point getEndPoint(){
        return end;
    }

    public String toString(){
        return String.format("Line:start %s, end %s", start.toString(), end.toString());
    }

    //Отталкивался от формулы площади треугольника: половина произведения основания на высоту
    public boolean isCollinearLine(Point p){
        return p != null
                && ((end.x-start.x) * (p.y - start.y) - (end.y - start.y) * (p.x - start.x)) % start.distance(end) == 0;
    }
}
