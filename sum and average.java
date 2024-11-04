import java.util.Scanner;

class SumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter how many numbers to calculate the sum and average of: ");
        int n = sc.nextInt();
        
        double sum = 0;
        int[] a = new int[n];
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        
        double average = sum / n;
        
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        
        // Close the scanner
        sc.close();
    }
}
