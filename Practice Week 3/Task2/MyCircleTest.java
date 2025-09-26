package Task2;

public class MyCircleTest {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(3,2,1);

        MyPoint p1 = new MyPoint(2,4);
        MyCircle c3 = new MyCircle(p1,2);

        System.out.println(); // Blank line
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        System.out.println(c3.getRadius());

        c2.setRadius(5);

        System.out.println(); // Blank line
        System.out.println(c2.getRadius());

        System.out.println(); // Blank line
        System.out.println(c1.getCenter());
        System.out.println(c2.getCenter());
        System.out.println(c3.getCenter());

        c1.setCenterXY(4, 1);
        c3.setCenterX(4);
        c2.setCenterY(1);

        System.out.println(); // Blank line
        System.out.println(c1.getCenterXYString());
        System.out.println(c2.getCenterX());
        System.out.println(c3.getCenterY());

        System.out.println(); // Blank line
        System.out.println(c1.getArea());
        System.out.println(c2.getCircumference());
        System.out.println(c3.distance(c1));

        System.out.println(); // Blank line
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
