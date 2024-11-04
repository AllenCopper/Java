import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = 'n';

        do {
            System.out.println("Enter the number assigned to the operation you want to perform:");
            System.out.println("1] Addition");
            System.out.println("2] Subtraction");
            System.out.println("3] Multiplication");
            System.out.println("4] Division");
            System.out.println("5] Find Factorial");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition: " + (a + b));
                    break;
                case 2:
                    System.out.println("Subtraction: " + (a - b));
                    break;
                case 3:
                    System.out.println("Multiplication: " + (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Division: " + (a / b));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.print("Enter the number for which to calculate factorial: ");
                    int num = sc.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <= num; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial: " + factorial);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

            System.out.print("To continue, enter 'y' for yes: ");
            c = sc.next().charAt(0);

        } while (c == 'y' || c == 'Y');

        sc.close();
    }
}
