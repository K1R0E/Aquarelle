package shape;


abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }
}

// Subclass for Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Subclass for Triangle
class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;

    public Triangle(double base, double height, double side1, double side2, String color) {
        super(color);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return base + side1 + side2;
    }
}

// Main program
public class Shape_Inheritance {
    public static void main(String[] args) {
        // Create instances of each shape
        Circle circle = new Circle(10, "Red");
        Rectangle rectangle = new Rectangle(4, 5, "Blue");
        Triangle triangle = new Triangle(4, 3, 4, 5, "Green");

        // Print results for Circle
        System.out.println("Circle:");
        System.out.printf("Area: %.10f\n", circle.getArea());
        System.out.printf("Perimeter: %.10f\n", circle.getPerimeter());
        System.out.println("Color: " + circle.getColor() + "\n");

        // Print results for Rectangle
        System.out.println("Rectangle:");
        System.out.printf("Area: %.1f\n", rectangle.getArea());
        System.out.printf("Perimeter: %.1f\n", rectangle.getPerimeter());
        System.out.println("Color: " + rectangle.getColor() + "\n");

        // Print results for Triangle
        System.out.println("Triangle:");
        System.out.printf("Area: %.1f\n", triangle.getArea());
        System.out.printf("Perimeter: %.1f\n", triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
    }
}
