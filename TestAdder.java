import java.util.Scanner;

class Adder {
    // Method to add two numbers
    double add(double x, double y) {
        return x + y;
    }

    // Method to add three numbers
    double add(double x, double y, double z) {
        return x + y + z;
    }
}

public class TestAdder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;

        // Prompt for user input
        System.out.print("Enter the 1st number: ");
        n1 = sc.nextDouble();
        System.out.print("Enter the 2nd number: ");
        n2 = sc.nextDouble();
        System.out.print("Enter the 3rd number: ");
        n3 = sc.nextDouble();

        // Create an Adder object and perform addition
        Adder adder = new Adder();
        System.out.println("Addition of 2 numbers = " + adder.add(n1, n2));
        System.out.println("Addition of 3 numbers = " + adder.add(n1, n2, n3));

        // Close the scanner resource
        sc.close();
    }
}
