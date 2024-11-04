
import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Ellipse implements Shape {
    private double major, minor;

    Ellipse(double major, double minor) {
        this.major = major;
        this.minor = minor;
    }

    @Override
    public double area() {
        return Math.PI * major * minor;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * Math.sqrt((major * major + minor * minor) / 2);
    }
}

public class TestShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter length and width of rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        System.out.print("Enter major and minor radius of ellipse: ");
        double major = scanner.nextDouble();
        double minor = scanner.nextDouble();

        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(length, width);
        Ellipse ellipse = new Ellipse(major, minor);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Ellipse Area: " + ellipse.area());
        System.out.println("Ellipse Perimeter: " + ellipse.perimeter());

        scanner.close();
    }
}
