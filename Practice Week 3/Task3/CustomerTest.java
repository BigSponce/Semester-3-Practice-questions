package Task3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Joey", 10);

        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getDiscount());

        System.out.println();
        c1.setDiscount(25);
        System.out.println(c1.getDiscount());

        System.out.println(c1.toString());
    }
}
