package com.workintech;

public class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance () {
        int distance = x*x + y*y;
        return Math.sqrt(distance);

    }
    public double distance(Point p) {
        int pX = p.getX();
        int pY = p.getY();
        int distance = (pX-x)*(pX-x) + (pY-y)*(pY-y);
        return Math.sqrt(distance);
    }
    public double distance(int a, int b) {

        int distance = (a-x)*(a-x) + (b-y)*(b-y);
        return Math.sqrt(distance);
    }

}
