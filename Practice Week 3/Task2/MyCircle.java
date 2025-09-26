package Task2;

import java.util.Arrays;

public class MyCircle {
    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;

    public MyCircle() {
        center = new MyPoint();
        this.radius = 1;        
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    } 

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setX(y);
    }

    public int[] getCenterXY() {
        return new int[] { center.getX(), center.getY() };
    }

    public String getCenterXYString() {
        return Arrays.toString(getCenterXY());
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    public String toString() {
        return "Radius: " + radius + " , Center: " + center.toString();
    }

    public double getArea() {
        return (Math.PI * (this.radius * this.radius));
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
}
