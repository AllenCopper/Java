import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of prime numbers to display: ");
        int n = s.nextInt();

        // Input validation
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int count = 0;
            int num = 2;

            System.out.println("First " + n + " prime numbers:");
            while (count < n) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
            System.out.println(); // Newline after all prime numbers are printed
        }
        
        // Close the scanner
        s.close();
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
