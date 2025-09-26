package Task1;

public class DemoCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5, "yellow");

        System.out.println(); // Blank line for readability

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());

        System.out.println(); // Blank line for readability

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        // Circle.PI = 22/7;
    }
    
}
