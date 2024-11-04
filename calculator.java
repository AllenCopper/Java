
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = 'n';

        do {
            System.out.println("Enter the number assign to operation which you want to perform:\n1] Addition\n2] Subtraction\n3] Multiplication\n4] Division\n5] To find Factorial");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition : " + (a + b));
                    break;
                case 2:
                    System.out.println("Subtraction : " + (a - b));
                    break;
                case 3:
                    System.out.println("Multiplication : " + a * b);
                    break;
                case 4:
                    System.out.println("Division : " + a / b);
                    break;
                case 5:
                    System.out.println("Enter the number which factorial is to be calculated");
                    int num = sc.nextInt();
                    int f = 1;
                    if (num == 0) {
                        System.out.println("Factorial : " + f);
                    } else {
                        for (int i = 1; i <= num; i++) {
                            f = f * i;
                        }
                        System.out.println("Factorial : " + f);
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("To continue enter yes");
            c = sc.next().charAt(0);
        } while (c == 'y' || c == 'Y');
    }
}
