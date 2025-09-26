public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0f, 2.5f);
        Rectangle r2 = new Rectangle(1.4f, 6.2f);

        System.out.println(r1.getArea());
        System.out.println(r2.getArea());

        System.out.println(r1.getPerimeter());
        System.out.println(r2.getPerimeter());
    }
}
