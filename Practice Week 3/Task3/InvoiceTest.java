package Task3;

public class InvoiceTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Joey", 10);
        Customer c2 = new Customer(2, "Johnny", 15);

        Invoice i1 = new Invoice(1, c1, 149.99);

        System.out.println(i1.getId());
        System.out.println(i1.getCustomer());

        i1.setCustomer(c2);

        System.out.println(i1.getCustomer());

        i1.setAmount(249.99);
        System.out.println(i1.getAmount());

        System.out.println(i1.getCustomerName());
        System.out.println(i1.getAmountAfterDiscount());
    }
}
