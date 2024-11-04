import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        int[] arr = new int[5];

        System.out.print("Enter the value of a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        b = scanner.nextDouble();

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        try {
            c = a / b;
            System.out.println("The result of a/b is: " + c);
            System.out.println("The element at arr[6] is: " + arr[6]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds.");
            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed.");
        }

        scanner.close();
    }
}
