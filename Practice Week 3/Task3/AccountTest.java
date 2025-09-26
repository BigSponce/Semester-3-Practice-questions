package Task3;

public class AccountTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Joey", 10);
        Customer c2 = new Customer(2, "Johnny", 15);

        Account a1 = new Account(1, c1, 1500.00);
        Account a2 = new Account(2, c2);

        System.out.println(a1.getId());
        System.out.println(a1.getCustomer());
        System.out.println(a1.getBalance());
        a2.setBalance(1000.00);
        System.out.println(a2.getBalance());

        System.out.println(a1.toString());
        System.out.println(a2.getCustomerName());

        a1.deposit(1000.00);
        System.out.println(a1.getBalance());
        a2.withdraw(1500.00);
        a1.withdraw(1500.00);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());


    }
}
