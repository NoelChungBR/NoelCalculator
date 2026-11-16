import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double x = input.nextDouble();
        System.out.println("Enter your second number: ");
        double y = input.nextDouble();
        System.out.println("Enter the operation you would like to perform (+, -, *, or /): ");
        String operation = input.next();
        if (operation.equals("+")) {
            System.out.println("Answer: " + (x + y));
        } else if (operation.equals("-")) {
            System.out.println("Answer: " + (x - y));
        } else if (operation.equals("*")) {
            System.out.println("Answer: " + (x * y));
        } else if (operation.equals("/")) {
            System.out.println("Answer: " + (x / y));
        }
    }
}