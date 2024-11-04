import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            System.out.println("Factorial = " + f);
        }
        
        // Close the scanner
        sc.close();
    }
}
