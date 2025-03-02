

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class aws {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("The area of the circle is: " + circle.calculateArea());
        Shape rectangle = new Rectangle(4, 7);
        System.out.println("The area of the rectangle is: " + rectangle.calculateArea());
    }
}