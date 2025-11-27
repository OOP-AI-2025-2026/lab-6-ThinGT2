package org.example;

interface Movable {
    void setX(double x);
    void setY(double y);
    double getX();
    double getY();

    void moveTo(double x, double y);
}

public class Point implements Movable {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void moveTo(double x, double y) {
        setX(x);
        setY(y);
        System.out.println("Точка переміщена до (" + x + ", " + y + ")");
    }

    public String toString() {
        return "Point at (" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(10.0, 20.0);
        System.out.println("Початок: " + p);

        p.setX(35.5);
        p.setY(50.0);
        System.out.println("Зміна позиції: (" + p.getX() + ", " + p.getY() + ")");

        p.moveTo(1.0, 5.0);
        System.out.println("Зміна позиції: " + p);
    }
}
