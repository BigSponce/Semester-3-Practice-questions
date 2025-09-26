public class Task3 {
    public static void main(String[] args) {
        float interestRate = 0.05f;
        float total = 1000.00f;


        System.out.println("Year       Amount on Deposit");
        for (int year = 1; year < 11; year++) {
            float profit = (total * interestRate);
            total += profit;
            System.out.printf("%d              %.2f%n", year, total); // Figuring out the formatting took some time, but got there in the end.
        }

    }
}
