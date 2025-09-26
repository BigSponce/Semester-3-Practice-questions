package Task1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private static final double PI = 3.14;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r) {
        this.radius = r;
        this.color = null;
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return (PI * (this.radius * this.radius));
    }

    public String toString() {
        return("Circle radius: " + this.radius + " and color is: " + this.color);
    }
}
