import java.util.Scanner;

class Rect {
    double width, length;
    String color;

    Rect(double width, double length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    double rectArea() {
        return width * length;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Input details for the first rectangle
            System.out.println("Enter the details of the first rectangle:");
            System.out.print("Enter the length: ");
            double l1 = sc.nextDouble();
            System.out.print("Enter the width: ");
            double w1 = sc.nextDouble();
            System.out.print("Enter the color: ");
            String c1 = sc.next();

            // Input details for the second rectangle
            System.out.println("Enter the details of the second rectangle:");
            System.out.print("Enter the length: ");
            double l2 = sc.nextDouble();
            System.out.print("Enter the width: ");
            double w2 = sc.nextDouble();
            System.out.print("Enter the color: ");
            String c2 = sc.next();

            // Create rectangle objects
            Rect rect1 = new Rect(w1, l1, c1);
            Rect rect2 = new Rect(w2, l2, c2);

            // Calculate and display areas
            double a1 = rect1.rectArea();
            double a2 = rect2.rectArea();

            System.out.println("Area of first rectangle (" + c1 + "): " + a1);
            System.out.println("Area of second rectangle (" + c2 + "): " + a2);

            // Compare areas
            if (a1 > a2) {
                System.out.println("The first rectangle has a larger area.");
            } else if (a2 > a1) {
                System.out.println("The second rectangle has a larger area.");
            } else {
                System.out.println("Both rectangles have the same area.");
            }

            // Ask user if they want to continue
            System.out.print("Do you want to compare another pair of rectangles? (yes/no): ");
            String response = sc.next();
            choice = response.equalsIgnoreCase("yes") ? 1 : 0;

        } while (choice == 1);

        sc.close();
    }
}
