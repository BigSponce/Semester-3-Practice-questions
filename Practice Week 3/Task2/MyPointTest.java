package Task2;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3,4);
        MyPoint p2 = new MyPoint(5,6);

        System.out.println(); // Blank line for readability
        System.out.println(p1.toString()); // Test toString, also to make sure setX and setY worked

        p1.setX(8);
        p1.setY(6);

        System.out.println(); // Blank line for readability
        System.out.println("x is: " + p1.getX()); // Test getX
        System.out.println("y is: " + p1.getY()); // Test getY
        System.out.println("x is: " + p2.getX());
        System.out.println("y is: " + p2.getY());
        System.out.println(); // Blank line for readability

        System.out.println(p1.toString()); // Show the change between initial and the new xy values
        System.out.println(p2.toString());

        p2.setXY(3, 0); // Test setXY

        System.out.println(); // Blank line for readability
        System.out.println(p2.toString()); // Show difference between initial and new xy values

        System.out.println(p1.distance(p2)); // distance from one MyPoint to another MyPoint
        System.out.println(p2.distance(p1)); // distance from one MyPoint to another MyPoint
        System.out.println(p1.distance(5, 6)); // distance from MyPoint to a different point
        System.out.println(p1.distance()); // distance from MyPoint to (0,0)
    }
}
