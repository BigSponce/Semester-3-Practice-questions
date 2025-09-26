import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter five single digit integers separated by commas: ");
        String line = input.nextLine();
        String[] parts = line.split(",");
        
        /*  This took a little figuring out and googling, 
        but with the bones being the same as other languages,
        it made figuring out the array and loop easier. */

        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        input.close();
        System.out.println("The biggest number is: " + max);
    }
}
