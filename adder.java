
import java.util.*;

class Adder {
    double a, b, c;

    // Constructor for two numbers
    Adder(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Constructor for three numbers
    Adder(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

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
        System.out.print("Enter 1st number: ");
        n1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        n2 = sc.nextDouble();
        System.out.print("Enter 3rd number: ");
        n3 = sc.nextDouble();

        // Create Adder objects and perform addition
        Adder a1 = new Adder(n1, n2);
        System.out.println("Addition of 2 numbers = " + a1.add(n1, n2));

        Adder a2 = new Adder(n1, n2, n3);
        System.out.println("Addition of 3 numbers = " + a2.add(n1, n2, n3));

        sc.close(); // Close the scanner resource
    }
}


