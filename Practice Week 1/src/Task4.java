import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n; // number
        int s = 0; // sum
        int c = 0; // count

        while (true) {
            System.out.println("Enter a number (-999 to exit): ");
            n = input.nextInt();

            if (n == -999) {
                break;
            }

            s += n;
            c++;
        }
        input.close();

        System.out.println("Total sum:" + s);

        double avg = (double)s/c;
        System.out.println("Average: "+ avg);
    }
}
