import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double num1, num2, sum;
        String op;

        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        op = input.next();

        switch (op) {
            case "+":
                sum = num1 + num2;
                System.out.println(num1 + " + "  + num2 + " = " + sum);
                break;
            case "-":
                sum = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + sum);
                break;
            case "*":
                sum = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + sum);
                break;
            case "/":
                sum = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + sum);
                break;
            default:
                System.out.println("Error: Incorrect operator");
        }
        input.close();

    }
}
