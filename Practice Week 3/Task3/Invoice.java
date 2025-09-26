package Task3;

public class Invoice {
    private int id;
    private Customer customer = new Customer(id, null, id);
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmountAfterDiscount() {
        double discountPercent = (customer.getDiscount() / 100.0);
        double discountAmt = amount * discountPercent;
        double total = amount - discountAmt;
        return total;
    }

}
