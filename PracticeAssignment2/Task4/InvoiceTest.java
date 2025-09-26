package Task4; // For some reason Java or VSCode decided this was needed, but wasn't for the others?

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice i1 = new Invoice("1", "Toaster", 4, 34.99);
        Invoice i2 = new Invoice("2", "Microwave", 6, 129.99);
        Invoice i3 = new Invoice("3", "Table & Chairs", 3, 469.99);
        Invoice i4 = new Invoice("4", "Dishwasher", 2, 579.99);
        Invoice i5 = new Invoice("5", "Desk", 3, 349.99);

        System.out.println(i1.toString());
        System.out.println(i2.toString());
        System.out.println(i3.toString());
        System.out.println(i4.toString());
        System.out.println(i5.toString());
        System.out.println(Invoice.getCount());
    }
}
