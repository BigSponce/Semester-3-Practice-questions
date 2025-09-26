package Task2;

public class MyTriangleTest {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(1,0,2,1,2,0);

        MyPoint p1 = new MyPoint(2,3);
        MyPoint p2 = new MyPoint(1,4);
        MyPoint p3 = new MyPoint(3,3);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);

        System.out.println(t1.toString());
        System.out.println(t2.toString());

        System.out.println(); // Blank line for readability
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());
    }
}
