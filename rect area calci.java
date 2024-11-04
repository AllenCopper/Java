
import java.util.Scanner;

class Rect {
    double width, length, area;
    String color;
    Scanner sc = new Scanner(System.in);

    Rect(double w, double l, String c) {
        width = w;
        length = l;
        color = c;
    }

    double rectArea() {
        return (width * length);
    }
}

class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            double w1, w2, l1, l2, a1, a2;
            String c1, c2;

            System.out.println("Enter the details of first rectangle:");
            System.out.println("Enter the length:");
            l1 = sc.nextDouble();
            System.out.println("Enter the width:");
            w1 = sc.nextDouble();
            System.out.println("Enter the color:");
            c1 = sc.next();

            Rect rect1 = new Rect(w1, l1, c1);
            a1 = rect1.rectArea();
            System.out.println("Area of first rectangle: " + a1 + " and color: " + c1);

            System.out.println("Enter the details of second rectangle:");
            System.out.println("Enter the length:");
            l2 = sc.nextDouble();
            System.out.println("Enter the width:");
            w2 = sc.nextDouble();
            System.out.println("Enter the color:");
            c2 = sc.next();

            Rect rect2 = new Rect(w2, l2, c2);
            a2 = rect2.rectArea();
            System.out.println("Area of second rectangle: " + a2 + " and color: " + c2);

            System.out.println("Do you want to enter details for another rectangle? (1 for Yes, 0 for No)");
            choice = sc.nextInt();
        } while (choice == 1);
    }
}
