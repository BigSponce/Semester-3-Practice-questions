package Task4; // For some reason Java or VSCode decided this was needed, but wasn't for the others?

public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    private static int invoiceCount = 0;

    // The Week 2 Work had a diagram named InvoiceItem, but the instructions said to create Invoice.java, so I followed the instructions.
    public Invoice(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }

    public String getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        double total = unitPrice * qty;
        return total;
    }

    public String toString() {
        return ("ID: " + this.id + ", Description: " + this.desc + ", Quantity: " + this.qty + ", Unit Price: " + this.unitPrice);
    }

    public static String getCount() {
        return ("There have been " + invoiceCount + " invoices printed.");
    }
}
        
